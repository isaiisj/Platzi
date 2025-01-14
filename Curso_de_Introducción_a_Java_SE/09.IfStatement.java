public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = false;
        int fileSent = 3;

        if (isBluetoothEnabled){
            //Send file
            fileSent++;
            System.out.println("Archivo Enviado");

        } else {
            fileSent--;
            System.out.println("Por favor enciente tu Bluetooth, para iniciar la transferencia");
        }

        System.out.println(isBluetoothEnabled);
        System.out.println(fileSent);
    }
}
