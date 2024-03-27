package ProjectObj;
import ProjectCls.Remote;

public class RemoteImpl {
    public static void main(String[] args) {
        Remote myRemote = new Remote();

        myRemote.TurnOn();
        myRemote.VolumeUp();
        myRemote.SetVolume(40);
        myRemote.VolumeDown();
        myRemote.brightnessUp();
        myRemote.SetBrightness(100);
        myRemote.SetBrightness(-20);
        myRemote.brightnessUp();
        myRemote.brightnessDown();
        myRemote.SetCable("VGA");
        myRemote.SetCable("Type-C");
        myRemote.TurnOff();
        myRemote.brightnessDown();
        myRemote.DisplayRemote();
    }
}
