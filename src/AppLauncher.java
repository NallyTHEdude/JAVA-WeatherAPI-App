import javax.swing.*;

public class AppLauncher {
    public static void main(String[] args) {
        // invokeLater in swing is used to make the application more thread safe
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                new WeatherAppGui().setVisible(true);
                //System.out.println(WeatherApp.getLocationData("India"));
                //System.out.println(WeatherApp.getCurrentTime());
            }
        });
    }
}
