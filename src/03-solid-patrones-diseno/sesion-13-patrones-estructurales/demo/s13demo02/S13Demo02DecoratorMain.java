package s13demo02;

public class S13Demo02DecoratorMain {
    public static void main(String[] args) {
        Notificador base = new NotificadorBase();
        new ModuloNotificaciones(base).avisar("Hola");
        new ModuloNotificaciones(new DecoradorPrefijo(base)).avisar("Hola");
        new ModuloNotificaciones(new DecoradorAuditoria(base)).avisar("Hola");
        System.out.println("Auditoria exterior:");
        new ModuloNotificaciones(new DecoradorAuditoria(
                new DecoradorPrefijo(base))).avisar("Hola");
        System.out.println("Prefijo exterior:");
        new ModuloNotificaciones(new DecoradorPrefijo(
                new DecoradorAuditoria(base))).avisar("Hola");
    }
}
