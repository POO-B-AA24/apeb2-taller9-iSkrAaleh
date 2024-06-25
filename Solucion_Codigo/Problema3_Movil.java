public class NewClass {
    public static void main(String[] args) {
        Movil iPhone15 = new Movil("Diana", 523523523);
        Movil NokiaPro = new Movil("Zoe", 235453235);

        SMS sms = new SMS(iPhone15, NokiaPro, "Saludillos?");
        MMS mms = new MMS(NokiaPro, iPhone15, "video.mp4");

        System.out.println(sms.enviarMensaje());
        System.out.println(sms.visualizarMensaje() + ": " + sms.mensajeDeTexto);

        System.out.println(mms.enviarMensaje());
        System.out.println(mms.visualizarMensaje() + ": " + mms.nombreDelArchivo);
    }
}

class Movil {
    public String nombre;
    public int numero;

    public Movil(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}

class Mensaje {
    public Movil remitente;
    public Movil destinatario;

    public Mensaje(Movil remitente, Movil destinatario) {
        this.remitente = remitente;
        this.destinatario = destinatario;
    }

    public Movil getRemitente() {
        return remitente;
    }

    public void setRemitente(Movil remitente) {
        this.remitente = remitente;
    }

    public Movil getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Movil destinatario) {
        this.destinatario = destinatario;
    }

    public String enviarMensaje() {
        return "Mensaje enviado de " + remitente.numero + " para " + destinatario.numero;
    }

    public String visualizarMensaje() {
        return "Mensaje imporate " + remitente.numero + " para " + destinatario.numero;
    }
}

class SMS extends Mensaje {
    public String mensajeDeTexto;

    public SMS(Movil remitente, Movil destinatario, String mensajeDeTexto) {
        super(remitente, destinatario);
        this.mensajeDeTexto = mensajeDeTexto;
    }

    @Override
    public String enviarMensaje() {
        return super.enviarMensaje() + " MSG: " + mensajeDeTexto;
    }

    @Override
    public String visualizarMensaje() {
        return super.visualizarMensaje() + " MSG: " + mensajeDeTexto;
    }
}

class MMS extends Mensaje {
    public String nombreDelArchivo;

    public MMS(Movil remitente, Movil destinatario, String nombreDelArchivo) {
        super(remitente, destinatario);
        this.nombreDelArchivo = nombreDelArchivo;
    }

    @Override
    public String enviarMensaje() {
        return super.enviarMensaje() + " Archivo: " + nombreDelArchivo;
    }

    @Override
    public String visualizarMensaje() {
        return super.visualizarMensaje() + " Archivo: " + nombreDelArchivo;
    }
}
