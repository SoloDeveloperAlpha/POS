package pos_pack;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tarea {
    private String titulo;
    private String descripcion;
    private String estado; // Ejemplo: "Pendiente", "En progreso", "Completada"
    private Usuario usuario; // Usuario que creó la tarea
    private LocalDateTime createdAt; // Fecha y hora de creación

    // Constructor completo
    public Tarea(String titulo, String descripcion, String estado, Usuario usuario, LocalDateTime createdAt) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.estado = estado;
        this.usuario = usuario;
        this.createdAt = createdAt;
    }

    // Constructor simplificado: asigna automáticamente la fecha actual
    public Tarea(String titulo, String descripcion, String estado, Usuario usuario) {
        this(titulo, descripcion, estado, usuario, LocalDateTime.now());
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    
    public String toString() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return "Tarea: " + titulo 
             + " | Estado: " + estado 
             + " | Descripción: " + descripcion
             + " | Usuario: " + (usuario != null ? usuario.getNickname() : "Desconocido")
             + " | Creada: " + createdAt.format(formato);
    }
}

