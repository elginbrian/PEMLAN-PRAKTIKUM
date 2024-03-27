package ProjectObj;
import java.util.Scanner;

import ProjectCls.Remote;
public class RemoteImpl2 {
    public static void main(String[] args) {
        Remote remote = new Remote();
        Scanner input = new Scanner(System.in);

        remote.DisplayRemote();
        while(true){
            String answer = "y";
            if(remote.getStatus().equals("OFF")){
                System.out.print("Ingin menyalakan remote sekarang? (y/n): ");
                
                answer = input.nextLine();
            }
            
            if(answer.equals("y")){
                if(remote.getStatus().equals("OFF")){
                    remote.TurnOn();
                }
                
                System.out.println("================================");
                System.out.println("Apa tindakan yang ingin anda lakukan?");
                System.out.println("1. Mengubah status");
                System.out.println("2. Mengubah volume");
                System.out.println("3. Mengubah kecerahan layar");
                System.out.println("4. Mengubah jenis kabel");
                System.out.println("5. Melihat informasi remote");
                System.out.print("Masukkan jawaban anda: ");
                int choice = input.nextInt();

                switch(choice){
                    case 1:
                        System.out.println("================================");
                        System.out.println("Apa tindakan yang ingin anda lakukan?");
                        System.out.println("1. Matikan remote");
                        System.out.println("2. Nyalakan remote");
                        System.out.println("3. Freeze remote");
                        System.out.print("Masukkan jawaban anda: ");
                        choice = input.nextInt();
                        input.nextLine();
                        switch(choice){
                            case 1:
                                System.out.println("================================");
                                remote.TurnOff();
                                break;
                            case 2:
                                System.out.println("================================");
                                remote.TurnOn();
                                break;
                            case 3:
                                System.out.println("================================");
                                remote.Freeze();
                                break;
                            default:
                                break;    
                        }   
                        break;
                    case 2:
                        System.out.println("================================");
                        System.out.println("Apa tindakan yang ingin anda lakukan?");
                        System.out.println("1. Naikkan volume");
                        System.out.println("2. Turunkan volume");
                        System.out.println("3. Set volume");
                        System.out.print("Masukkan jawaban anda: ");     
                        choice = input.nextInt();
                        input.nextLine();
                        switch(choice){
                            case 1:
                                System.out.println("================================");
                                remote.VolumeUp();
                                break;
                            case 2:
                                System.out.println("================================");
                                remote.VolumeDown();
                                break;
                            case 3:
                                System.out.println("================================");
                                System.out.print("Masukkan volume baru: ");
                                choice = input.nextInt();
                                remote.SetVolume(choice);
                                break;    
                        }     
                        break;
                    case 3:
                        System.out.println("================================");
                        System.out.println("Apa tindakan yang ingin anda lakukan?");
                        System.out.println("1. Naikkan kecerahan layar");
                        System.out.println("2. Turunkan kecerahan layar");
                        System.out.println("3. Set kecerahan layar");
                        System.out.print("Masukkan jawaban anda: ");     
                        choice = input.nextInt();
                        input.nextLine();
                        switch(choice){
                            case 1:
                                System.out.println("================================");
                                remote.brightnessUp();
                                break;
                            case 2:
                                System.out.println("================================");
                                remote.brightnessDown();
                                break;
                            case 3:
                                System.out.println("================================");
                                System.out.print("Masukkan kecerahan layar baru: ");
                                choice = input.nextInt();
                                remote.SetBrightness(choice);
                                break;
                        }
                        break;
                    case 4:
                        System.out.println("================================");
                        System.out.println("Apa tindakan yang ingin anda lakukan?");
                        System.out.println("1. HDMI");
                        System.out.println("2. VGA");
                        System.out.println("3. DVI");
                        System.out.println("4. DisplayPort");
                        System.out.print("Masukkan jawaban anda: ");     
                        String cable = input.nextLine();
                        System.out.println("================================");
                        remote.SetCable(cable);
                        break;
                    case 5:
                        remote.DisplayRemote();
                        break;    
                    default:
                        System.out.println("Invalid");
                        break;    
                }    

            }
        }
    }
}
