import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class WeatherAppGui extends JFrame {
    public WeatherAppGui() {
        super("Weather App");

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setSize(450, 650);

        setLocationRelativeTo(null);

        setLayout(null);

        setResizable(false);

        addGuiComponents();
    }

    private void addGuiComponents() {
        JTextField searchTextField = new JTextField();

        searchTextField.setBounds(15, 15, 351, 45);

        searchTextField.setFont(new Font("Dialog", Font.PLAIN, 24));

        add(searchTextField);

        // adding an image to the button
        JButton searchButton = new JButton(loadImage("assets/search.png"));
        searchButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        searchButton.setBounds(375, 13, 47, 45);
        add(searchButton);

        // adding cloudy image
        JLabel weatherConditionImage = new JLabel(loadImage("assets/cloudy.png"));
        weatherConditionImage.setBounds(0, 125, 450, 217);
        add(weatherConditionImage);

        // adding cloudy text description
        JLabel weatherConditionDesc = new JLabel("Cloudy");
        weatherConditionDesc.setBounds(0, 405, 450, 36);
        weatherConditionDesc.setFont(new Font("Dialog", Font.PLAIN, 32));
        weatherConditionDesc.setHorizontalAlignment(SwingConstants.CENTER);
        add(weatherConditionDesc);

        // adding temperature value
        JLabel temperatureText = new JLabel("10 C");
        temperatureText.setBounds(0, 350, 450, 54);
        temperatureText.setFont(new Font("Dialog", Font.BOLD, 48));
        temperatureText.setHorizontalAlignment(SwingConstants.CENTER);
        add(temperatureText);

        // adding humidity image
        JLabel humidityImage = new JLabel(loadImage("assets/humidity.png"));
        humidityImage.setBounds(15, 500, 74, 66);
        add(humidityImage);

        // adding humidity text description
        JLabel humidityText = new JLabel("<html><b>Humidity</b></html>");
        humidityText.setBounds(90, 500, 85, 55);
        add(humidityText);
    }

    private ImageIcon loadImage(String resourcePath) {

        try {
            BufferedImage image = ImageIO.read(new File(resourcePath));

            return new ImageIcon(image);
        } catch (IOException e) {
            System.out.println("Could not find resource.");
        }

        return null;
    }
}
