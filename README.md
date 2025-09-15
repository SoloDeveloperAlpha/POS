# Plataforma para la Organización y Seguimiento de Proyectos (POS)

---

## Consideraciones Iniciales
Los primeros avances del proyecto estaban en una **etapa de bocetos iniciales**, por lo que esta versión se ve diferente a las presentaciones anteriores.  
Los cambios realizados buscan **alinear el desarrollo con la problemática definida y los objetivos del proyecto**.  
Dado que se trata de un avance, **aún no se han implementado todos los requerimientos definidos**.

---

## Caso o Problemática
En la universidad, los estudiantes presentan dificultades para entregar proyectos de programación de manera organizada y colaborativa:

- Falta de metodologías de seguimiento.  
- Uso inadecuado de herramientas de control de versiones.  
- Comunicación deficiente entre los miembros del equipo.  
- Carencia de registros individuales de contribuciones.  

**Problema central:** Desorden y retrasos en proyectos grupales de software.  

**Solución:** Crear un sistema llamado **“Plataforma para la Organización y Seguimiento de Proyectos (POS)”**.

---

## Análisis de Causas
**Efecto:** Desorden y retrasos en proyectos grupales de software.  
*(Incluir Diagrama de Ishikawa)*

---

## Solución Propuesta
**Repositorio compartido en GitHub/GitLab con:**

**Buenas prácticas de Git:**
- Convenciones de nombres para ramas y archivos.  
- Mensajes de commit claros.  
- Uso de ramas con Git Flow simplificado.  
- Comandos avanzados (`git stash`, `git revert`, `git cherry-pick`).  

**Evidencia individual:**
- Código en Java con ejemplos de sobrecarga de métodos.  
- Manejo de errores con excepciones.  
- Uso de colecciones (listas, mapas, etc.).  

**Documentación grupal:**
- Informe con problemática, diagrama de Ishikawa y antecedentes APA.  
- Checklist de buenas prácticas de desarrollo.

---

## Restricciones
- Solo usuarios con **roles específicos** podrán realizar acciones administrativas.  
- Contraseñas **encriptadas** y registro de **log de actividades**.  
- Enfoque en **seguimiento y control**, no creación de nuevos proyectos.  
- Listas de usuarios y tareas paginadas si superan los 20 registros.  

---

## Requerimientos Funcionales (Resumen)
### Módulo de Usuarios
- Registrar, modificar y eliminar usuarios.  
- Iniciar sesión y validar credenciales.  
- Asignar roles y bloquear acceso tras 3 intentos fallidos.  

### Módulo de Tareas
- Crear, editar y eliminar tareas.  
- Mostrar tareas en tabla con estado y prioridad.  
- Filtrar y buscar tareas.  
- Marcar tareas como completadas.  

### Módulo de Administración
- Generar reportes y exportarlos a CSV.  
- Ver actividad de usuarios.  
- Reasignar tareas y enviar alertas de tareas pendientes.  

### Módulo de Seguridad y Control
- Encriptar contraseñas.  
- Registrar intentos fallidos y log de actividades.  
- Restringir acciones según rol.  

### Módulo de Usabilidad y Escalabilidad
- Mensajes de confirmación antes de eliminar datos.  
- Configuración de idioma y formato de fecha/hora.  
- Resumen general de usuarios y tareas.

---

## Objetivos del Proyecto
**Objetivo General:**  
Desarrollar una plataforma para mejorar el **seguimiento y organización de proyectos de software**, promoviendo colaboración eficiente y buenas prácticas.  

**Objetivos Específicos:**
- Centralizar información de proyectos y tareas.  
- Facilitar visualización del progreso mediante métricas.  
- Garantizar evidencia individual y grupal.  
- Implementar buenas prácticas de gestión de código.  
- Generar alertas sobre retrasos o tareas críticas.  
- Evaluar desempeño del equipo e identificar áreas de mejora.  
- Promover colaboración y comunicación efectiva.  
- Asegurar seguridad y trazabilidad de la información.  
- Facilitar documentación y registro de buenas prácticas.  
- Proporcionar reportes y estadísticas para mejora continua.

---

## Historias de Usuario (Ejemplos)
1. *Como usuario, quiero marcar mis tareas como completadas para llevar un seguimiento del avance.*  
   - Requerimiento: Permitir marcar tareas como completadas y actualizar su estado.  

2. *Como administrador, quiero generar reportes de usuarios y tareas para supervisar el progreso del equipo.*  
   - Requerimientos: Generar reportes de usuarios y tareas pendientes.  

3. *Como usuario, quiero buscar y filtrar tareas por título, estado o prioridad para encontrar rápidamente lo que necesito.*  
   - Requerimientos: Filtrar tareas por estado y buscar por título/descripcion.  

4. *Como administrador, quiero reasignar tareas a otros usuarios para equilibrar la carga de trabajo.*  
   - Requerimiento: Permitir la reasignación de tareas a otros usuarios.  
