package ProjectCls;
public class Remote{
    private String status;
    private int volume;
    private int brightness;
    private String cable;

    public Remote(){
        this.status     = "OFF";
        this.volume     = 50;
        this.brightness = 50;
        this.cable      = "HDMI";
    }

    public String getStatus(){
        return this.status;
    }
    public void TurnOn(){
        this.status = "ON";
        System.out.println("Status: "+ this.status);
    }
    public void TurnOff(){
        this.status = "OFF";
        System.out.println("Status: "+ this.status);
    }
    public void Freeze(){
        this.status = "FREEZE";
        System.out.println("Status: "+ this.status);
    }

    public void VolumeUp(){
        if(this.status.equals("ON")){
            if(this.volume < 100){
                this.volume += 5;
            }
            System.out.println("Volume: "+ this.volume);
        } else {
            System.out.println("The remote is currently "+ this.status);
        }
            
    }
    public void VolumeDown(){
        if(this.status.equals("ON")){
            if(this.volume > 0){
                this.volume -= 5;
            }
            System.out.println("Volume: "+ this.volume);
        } else {
            System.out.println("The remote is currently "+ this.status);
        }   
    }    
    public void SetVolume(int vol){
        if(this.status.equals("ON")){
            if(vol >= 0 && vol <= 100){
                this.volume = vol;
                System.out.println("Volume: "+ this.volume);
            } else {
                System.out.println("Volume invalid");
            }
        } else {
            System.out.println("The remote is currently "+ this.status);
        }  
    }

    public void brightnessUp(){
        if(this.status.equals("ON")){
            if(this.brightness < 100){
                this.brightness += 5;
            }
            System.out.println("Brightness: "+ this.brightness);
        } else {
            System.out.println("The remote is currently "+ this.status);
        }   
    }
    public void brightnessDown(){
        if(this.status.equals("ON")){
            if(this.brightness > 0){
                this.brightness -= 5;
            }
            System.out.println("Brightness: "+ this.brightness);
        } else {
            System.out.println("The remote is currently "+ this.status);
        }   
    }    
    public void SetBrightness(int br){
        if(this.status.equals("ON")){
            if(br >= 0 && br <= 100){
                this.brightness = br;
                System.out.println("Brightness: "+ this.brightness);
            } else {
                System.out.println("Brightness invalid");
            }
        } else {
            System.out.println("The remote is currently "+ this.status);
        }   
    } 
    
    public void SetCable(String cable){
        if(this.status.equals("ON")){
            switch (cable) {
                case "HDMI":
                    this.cable = cable;
                    System.out.println("Cable: "+ this.cable);
                    break;
                case "VGA":
                    this.cable = cable;
                    System.out.println("Cable: "+ this.cable);
                    break;
                case "DVI":
                    this.cable = cable;
                    System.out.println("Cable: "+ this.cable);
                    break;
                case "DisplayPort":
                    this.cable = cable;
                    System.out.println("Cable: "+ this.cable);
                    break;    
                default:
                    System.out.println("Cable invalid");
                    break;
            }
        } else {
            System.out.println("The remote is currently "+ this.status);
        }   
    }

    public void DisplayRemote(){
        System.out.println("=============================================");
        System.out.println("Status: " + this.status);
        System.out.println("Volume: " + this.volume);
        System.out.println("Brightness: " + this.brightness);
        System.out.println("Cable: " + this.cable);
        System.out.println("=============================================");
    }
}   