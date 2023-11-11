package presentacion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RelojDigital extends JFrame {

    private JLabel etiquetaHora;

    public RelojDigital() {
        // Configurar la ventana
        setTitle("Reloj Digital");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null); // Centrar en la pantalla

        // Configurar la etiqueta para mostrar la hora
        etiquetaHora = new JLabel();
        etiquetaHora.setFont(new Font("Arial", Font.PLAIN, 36));
        etiquetaHora.setHorizontalAlignment(JLabel.CENTER);
        // Agregar la etiqueta a la ventana
        add(etiquetaHora);
        setVisible(true);

        actualizarHora(); // Actualizar la hora inicial
    }

    private void actualizarHora() {
        // Obtener la hora actual
        Date horaActual = new Date();

        // Formatear la hora como cadena
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
        String horaFormateada = formatoHora.format(horaActual);

        // Actualizar el texto de la etiqueta
        etiquetaHora.setText(horaFormateada);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actualizarHora();
    }
}
