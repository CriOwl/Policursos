-- database: ../Data_Base/policurso.sqlite

INSERT INTO CATALOGO_TIPO ( nombre) VALUES
('Países'),
('Categorías'),
('Idiomas'),
('Niveles'),
('Roles'),
('Temas'),
('Departamentos'),
('Cursos'),
('Materias'),
('Especialidades');

INSERT INTO CATALOGO (nombre, id_tipo, id_padre) VALUES
( 'Ecuador',1,1),
( 'Estados Unidos', 1,1),
( 'Programación', 2,1),
( 'Bases de Datos', 2, 3),
( 'Español', 3,1),
( 'Inglés', 3,1),
( 'Básico', 4,1),
( 'Intermedio', 4,1),
( 'Avanzado', 4,1),
( 'Administrador', 5,1),
('Colombia', 1, 1),
('Argentina', 1, 1),
('Matemáticas', 2, 1),
('Física', 2, 1),
('Francés', 3, 1),
('Portugués', 3, 1),
('Inicial', 4, 1),
('Avanzado Superior', 4, 9),
('Gerente', 5, 1),
('Supervisor', 5, 1);


INSERT INTO Persona (nombre, apellido, correo, descripcion, clave, id_catalogo_pais, fecha_nacimiento) VALUES
('Juan', 'Pérez', 'juan.perez@example.com', 'Tutor de programación', 'clave123', 1, '1990-05-15'),
('Ana', 'Gómez', 'ana.gomez@example.com', 'Estudiante apasionada por bases de datos', 'clave456', 2, '2000-08-20'),
('Carlos', 'Martínez', 'carlos.martinez@example.com', 'Experto en idiomas', 'clave789', 1, '1985-03-10'),
('Lucía', 'Ramírez', 'lucia.ramirez@example.com', 'Investigadora académica', 'clave101', 2, '1995-12-12'),
('Diego', 'García', 'diego.garcia@example.com', 'Estudiante de nivel intermedio', 'clave202', 1, '1997-07-25'),
('María', 'Fernández', 'maria.fernandez@example.com', 'Estudiante destacada', 'clave303', 2, '1992-06-10'),
('Laura', 'Gómez', 'laura.gomez@example.com', 'Docente de bases de datos', 'clave404', 1, '1988-01-15'),
('Pedro', 'Lopez', 'pedro.lopez@example.com', 'Tutor avanzado', 'clave505', 1, '1983-09-22'),
('Andrea', 'Sánchez', 'andrea.sanchez@example.com', 'Estudiante avanzada', 'clave606', 2, '1999-04-05'),
('Jorge', 'Hernández', 'jorge.hernandez@example.com', 'Especialista en administración', 'clave707', 1, '1987-11-03'),
('Luis', 'Ortiz', 'luis.ortiz@example.com', 'Estudiante de nivel básico', 'clave808', 1, '1998-01-10'),
('Sofía', 'Mendoza', 'sofia.mendoza@example.com', 'Tutora avanzada en matemáticas', 'clave909', 2, '1991-09-19'),
('Tomás', 'Reyes', 'tomas.reyes@example.com', 'Docente en física', 'clave010', 1, '1980-11-21'),
('Natalia', 'Morales', 'natalia.morales@example.com', 'Especialista en francés', 'clave111', 2, '1993-06-25'),
('Sergio', 'Vargas', 'sergio.vargas@example.com', 'Administrador de proyectos', 'clave212', 1, '1986-03-15'),
('Claudia', 'Castro', 'claudia.castro@example.com', 'Estudiante en diseño gráfico', 'clave313', 2, '2002-07-30'),
('Gabriel', 'Hernández', 'gabriel.hernandez@example.com', 'Tutor en programación avanzada', 'clave414', 1, '1978-04-10'),
('Isabel', 'Suárez', 'isabel.suarez@example.com', 'Estudiante destacada en marketing', 'clave515', 2, '1997-10-20'),
('Ricardo', 'Jiménez', 'ricardo.jimenez@example.com', 'Investigador en inteligencia artificial', 'clave616', 1, '1984-08-17'),
('Carmen', 'López', 'carmen.lopez@example.com', 'Estudiante de proyectos académicos', 'clave717', 2, '1995-12-05');

INSERT INTO Curso (id_tutor,nombre, descripcion, id_catalogo_categoria, id_catalogo_subcategoria, id_catalogo_idioma, id_catalogo_nivel, fecha_inicio, fecha_fin, Nota_aprobacion, Duracion) VALUES
(1, 'Curso Básico de Programación', 'Curso introductorio para principiantes.', 3, 4, 5, 7, '2025-02-01', '2025-03-01', 70, 30),
(1, 'Bases de Datos Relacionales', 'Curso intermedio sobre bases de datos.', 3, 4, 5, 8, '2025-03-05', '2025-04-05', 75, 40),
(1, 'Curso de Inglés Básico', 'Aprendizaje del idioma inglés desde cero.', 6, 6, 6, 7, '2025-02-15', '2025-03-15', 65, 25),
(1, 'Administración Avanzada', 'Curso para profesionales en administración.', 3, 4, 5, 9, '2025-01-20', '2025-02-20', 80, 50),
(1, 'Técnicas de Investigación', 'Curso especializado en investigación académica.', 3, 4, 5, 8, '2025-03-10', '2025-04-10', 85, 35),
(1, 'Redes y Comunicaciones', 'Conocimiento sobre redes informáticas.', 3, 4, 5, 8, '2025-03-01', '2025-04-01', 75, 30),
(1, 'Diseño Gráfico Digital', 'Curso creativo para diseñadores.', 3, 4, 5, 9, '2025-02-10', '2025-03-10', 70, 20),
(1, 'Marketing Estratégico', 'Curso avanzado en marketing.', 3, 4, 5, 9, '2025-03-05', '2025-04-05', 85, 40),
(1, 'Introducción a la IA', 'Conceptos básicos sobre inteligencia artificial.', 3, 4, 5, 8, '2025-04-01', '2025-05-01', 75, 35),
(1, 'Gestión de Proyectos', 'Curso para aprender sobre la gestión de proyectos.', 3, 4, 5, 9, '2025-03-20', '2025-04-20', 80, 45),
(2, 'Curso Intermedio de Matemáticas', 'Ampliación de fundamentos matemáticos.', 3, 4, 5, 8, '2025-05-01', '2025-06-01', 70, 30),
(3, 'Física Avanzada', 'Conocimientos avanzados en física.', 3, 4, 5, 9, '2025-06-05', '2025-07-05', 85, 40),
(4, 'Francés Básico', 'Introducción al idioma francés.', 6, 6, 6, 7, '2025-05-15', '2025-06-15', 65, 25),
(5, 'Gestión Empresarial', 'Administración y liderazgo empresarial.', 3, 4, 5, 8, '2025-05-10', '2025-06-10', 80, 45),
(6, 'Curso de Fotografía', 'Exploración del mundo de la fotografía.', 3, 4, 5, 7, '2025-06-01', '2025-07-01', 75, 30),
(7, 'Marketing Digital', 'Estrategias en redes sociales y más.', 3, 4, 5, 9, '2025-06-15', '2025-07-15', 85, 40),
(8, 'Avances en IA', 'Temas especializados en inteligencia artificial.', 3, 4, 5, 9, '2025-07-01', '2025-08-01', 90, 35),
(9, 'Desarrollo de Software', 'Principios y prácticas en desarrollo.', 3, 4, 5, 8, '2025-05-20', '2025-06-20', 75, 40),
(10, 'Cursos Prácticos de Diseño', 'Creación de proyectos de diseño gráfico.', 3, 4, 5, 9, '2025-06-10', '2025-07-10', 80, 25),
(1, 'Gestión de Equipos', 'Formación en manejo y liderazgo de equipos.', 3, 4, 5, 9, '2025-05-25', '2025-06-25', 75, 30);

INSERT INTO Modulo (id_curso,nombre, descripcion) VALUES
(2,'Introducción', 'Fundamentos básicos del curso.'),
(2,'SQL Básico', 'Primeros pasos con bases de datos relacionales.'),
(2,'Gramática Básica', 'Gramática para principiantes en inglés.'),
(2,'Herramientas Avanzadas', 'Uso de herramientas administrativas.'),
(2,'Métodos de Investigación', 'Técnicas y métodos de investigación.'),
(2,'Configuración de Redes', 'Montaje y configuración de redes.'),
(2,'Principios de Diseño', 'Conceptos básicos de diseño gráfico.'),
(2,'Planificación Estratégica', 'Técnicas de planificación en marketing.'),
(2,'Introducción a Python', 'Primeros pasos en programación para IA.'),
(2,'Planificación de Proyectos', 'Elaboración de planes de proyectos.'),
(3, 'Introducción a la Física', 'Conceptos básicos de física.'),
(3, 'Dinámica y Movimiento', 'Estudio de las leyes del movimiento.'),
(3, 'Óptica y Ondas', 'Principios de luz y sonido.'),
(4, 'Vocabulario Básico', 'Palabras y frases comunes en francés.'),
(4, 'Conversación Inicial', 'Prácticas orales para principiantes.'),
(5, 'Liderazgo', 'Habilidades para liderar equipos empresariales.'),
(5, 'Gestión Financiera', 'Administración de recursos económicos.'),
(6, 'Técnicas Fotográficas', 'Uso de herramientas y cámaras.'),
(7, 'SEO y SEM', 'Optimización de motores de búsqueda.'),
(8, 'Redes Neuronales', 'Introducción a redes neuronales.');

INSERT INTO Actividad_tipo (nombre, descripcion) VALUES
('Tarea', 'Actividad evaluada mediante tareas individuales.'),
('Examen', 'Evaluación escrita o práctica.'),
('Proyecto', 'Entrega de proyectos finales.'),
('Cuestionario', 'Evaluaciones rápidas en formato de cuestionario.'),
('Práctica', 'Trabajo práctico para aplicar conocimientos.'),
('Debate', 'Discusión grupal sobre temas del curso.'),
('Reporte', 'Elaboración de informes detallados.'),
('Presentación', 'Exposición de temas específicos.'),
('Investigación', 'Trabajo investigativo profundo.'),
('Evaluación continua', 'Evaluación constante durante el curso.'),
('Simulación', 'Práctica en entornos simulados.'),
('Caso de Estudio', 'Análisis de situaciones reales.'),
('Taller', 'Actividad de aprendizaje práctico.'),
('Investigación de Campo', 'Estudio realizado fuera del aula.'),
('Foro de Discusión', 'Interacción grupal en línea.'),
('Análisis de Datos', 'Estudio e interpretación de información.'),
('Trabajo Colaborativo', 'Actividades en equipo.'),
('Práctica en Laboratorio', 'Ejercicios realizados en laboratorio.'),
('Evaluación Oral', 'Presentación evaluada verbalmente.'),
('Planificación de Estrategias', 'Creación de estrategias de trabajo.');

INSERT INTO Modulo_actividad (id_actividad, id_modulo, descripcion, fecha_inicio, fecha_fin, Nota_max, Ponderacion) VALUES
(2,1, 'Tarea inicial del curso.', '2025-02-05', '2025-02-10', 100, 10),
(2,2, 'Primer examen práctico.', '2025-02-15', '2025-02-20', 100, 20),
(2,3, 'Proyecto grupal.', '2025-03-01', '2025-03-10', 100, 30),
(2,4, 'Cuestionario teórico.', '2025-03-05', '2025-03-08', 50, 15),
(2,5, 'Práctica aplicada.', '2025-02-25', '2025-02-28', 50, 25),
(2,6, 'Debate sobre un tema relevante.', '2025-03-12', '2025-03-15', 20, 5),
(2,7, 'Reporte detallado de actividad.', '2025-03-20', '2025-03-25', 100, 10),
(2,8, 'Presentación final.', '2025-03-30', '2025-04-01', 50, 15),
(2,9, 'Trabajo de investigación.', '2025-04-05', '2025-04-15', 100, 25),
(2, 10, 'Evaluación continua.', '2025-02-01', '2025-03-01', 200, 20),
(3, 3, 'Simulación práctica de conceptos.', '2025-05-10', '2025-05-15', 100, 20),
(3, 4, 'Caso de estudio aplicado.', '2025-05-20', '2025-05-25', 100, 25),
(3, 5, 'Investigación de campo.', '2025-06-01', '2025-06-10', 100, 30),
(3, 6, 'Taller grupal.', '2025-06-15', '2025-06-20', 100, 15),
(3, 7, 'Foro de discusión.', '2025-06-25', '2025-06-30', 50, 10),
(3, 8, 'Evaluación oral final.', '2025-07-05', '2025-07-10', 50, 20),
(3, 9, 'Trabajo colaborativo.', '2025-07-15', '2025-07-20', 100, 25),
(3, 10, 'Práctica en laboratorio.', '2025-07-25', '2025-07-30', 100, 15),
(4, 1, 'Análisis de datos inicial.', '2025-06-05', '2025-06-10', 100, 20),
(4, 2, 'Planificación estratégica.', '2025-06-15', '2025-06-20', 100, 30);

INSERT INTO Estudiante_curso (id_estudiante,id_curso, id_catalogo_curso) VALUES
(1, 1, 3),
(2, 2, 4),
(3, 3, 5),
(4, 4, 6),
(5, 5, 7),
(6, 6, 8),
(7, 7, 9),
(9, 8, 10),
(9, 9, 3),
(10, 10, 4),
(2, 3, 5),
(3, 4, 6),
(4, 5, 7),
(5, 6, 8),
(6, 7, 9),
(7, 8, 10),
(8, 9, 3),
(9, 10, 4),
(10, 1, 5),
(1, 2, 6);

INSERT INTO Nota (id_modulo_actividad,id_estudiante_curso, Nota) VALUES
( 1,1, 85),
( 1,2, 90),
( 2,3, 95),
( 1,4, 80),
( 2,5, 75),
( 3,6, 70),
( 4,7, 65),
( 5,8, 60),
( 6,9, 55),
(7,10, 50),
(8, 1, 88),
(8, 2, 92),
(9, 3, 97),
(10, 4, 81),
(11, 5, 78),
(12, 6, 72),
(13, 7, 68),
(14, 8, 64),
(15, 9, 59),
(16, 10, 54);