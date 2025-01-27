-- database: ../Data_Base/policurso.sqlite

INSERT INTO CATALOGO_TIPO ( Nombre) VALUES
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

INSERT INTO CATALOGO (Nombre, Id_tipo, Id_padre) VALUES
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

INSERT INTO Rol (Nombre) VALUES
('Administrador'),
('Estudiante'),
('Tutor'),
('Docente'),
('Investigador');

-- Inserción en Sexo
INSERT INTO Sexo (Nombre) VALUES
('Masculino'),
('Femenino'),
('Otro');

INSERT INTO MetodoPago (Nombre) VALUES
('Tarjeta de Crédito'),
('PayPal'),
('Transferencia Bancaria'),
('Efectivo');

INSERT INTO Persona (Id_rol, Id_sexo, Cedula, Nombre, Apellido, Correo, Descripcion, Clave, Id_catalogo_pais, Fecha_nacimiento) VALUES
(2, 1, '1723456789', 'Juan', 'Pérez', 'juan.perez@example.com', 'Tutor de programación', 'clave123', 1, '1990-05-15'),
(2, 2, '1712345678', 'Ana', 'Gómez', 'ana.gomez@example.com', 'Estudiante apasionada por bases de datos', 'clave456', 2, '2000-08-20'),
(3, 1, '1728765432', 'Carlos', 'Martínez', 'carlos.martinez@example.com', 'Experto en idiomas', 'clave789', 1, '1985-03-10'),
(4, 2, '1734567890', 'Lucía', 'Ramírez', 'lucia.ramirez@example.com', 'Investigadora académica', 'clave101', 2, '1995-12-12'),
(2, 1, '1745678901', 'Diego', 'García', 'diego.garcia@example.com', 'Estudiante de nivel intermedio', 'clave202', 1, '1997-07-25'),
(2, 2, '1756789012', 'María', 'Fernández', 'maria.fernandez@example.com', 'Estudiante destacada', 'clave303', 2, '1992-06-10'),
(4, 2, '1767890123', 'Laura', 'Gómez', 'laura.gomez@example.com', 'Docente de bases de datos', 'clave404', 1, '1988-01-15'),
(3, 1, '1778901234', 'Pedro', 'Lopez', 'pedro.lopez@example.com', 'Tutor avanzado', 'clave505', 1, '1983-09-22'),
(2, 2, '1789012345', 'Andrea', 'Sánchez', 'andrea.sanchez@example.com', 'Estudiante avanzada', 'clave606', 2, '1999-04-05'),
(5, 1, '1790123456', 'Jorge', 'Hernández', 'jorge.hernandez@example.com', 'Especialista en administración', 'clave707', 1, '1987-11-03'),
(2, 1, '1801234567', 'Luis', 'Ortiz', 'luis.ortiz@example.com', 'Estudiante de nivel básico', 'clave808', 1, '1998-01-10'),
(4, 2, '1812345678', 'Sofía', 'Mendoza', 'sofia.mendoza@example.com', 'Tutora avanzada en matemáticas', 'clave909', 2, '1991-09-19'),
(4, 1, '1823456789', 'Tomás', 'Reyes', 'tomas.reyes@example.com', 'Docente en física', 'clave010', 1, '1980-11-21'),
(3, 2, '1834567890', 'Natalia', 'Morales', 'natalia.morales@example.com', 'Especialista en francés', 'clave111', 2, '1993-06-25'),
(5, 1, '1845678901', 'Sergio', 'Vargas', 'sergio.vargas@example.com', 'Administrador de proyectos', 'clave212', 1, '1986-03-15'),
(2, 2, '1856789012', 'Claudia', 'Castro', 'claudia.castro@example.com', 'Estudiante en diseño gráfico', 'clave313', 2, '2002-07-30'),
(3, 1, '1867890123', 'Gabriel', 'Hernández', 'gabriel.hernandez@example.com', 'Tutor en programación avanzada', 'clave414', 1, '1978-04-10'),
(2, 2, '1878901234', 'Isabel', 'Suárez', 'isabel.suarez@example.com', 'Estudiante destacada en marketing', 'clave515', 2, '1997-10-20'),
(3, 1, '1889012345', 'Ricardo', 'Jiménez', 'ricardo.jimenez@example.com', 'Investigador en inteligencia artificial', 'clave616', 1, '1984-08-17'),
(2, 2, '1890123456', 'Carmen', 'López', 'carmen.lopez@example.com', 'Estudiante de proyectos académicos', 'clave717', 2, '1995-12-05');

INSERT INTO Curso 
(Id_tutor,        Nombre,                           Descripcion,                           Id_catalogo_categoria, Id_catalogo_subcategoria, Id_catalogo_nivel   ) VALUES
(1,   'Curso Básico de Programación'    , 'Curso introductorio para principiantes.'                 , 3                   , 4                     , 7            ),
(1,   'Bases de Datos Relacionales'     , 'Curso intermedio sobre bases de datos.'                  , 3                   , 4                     , 8            ),
(1,   'Curso de Inglés Básico'          , 'Aprendizaje del idioma inglés desde cero.'               , 6                   , 6                     , 7            ),
(1,   'Administración Avanzada'         , 'Curso para profesionales en administración.'             , 3                   , 4                     , 9            ),
(1,   'Técnicas de Investigación'       , 'Curso especializado en investigación académica.'         , 3                   , 4                     , 8            ),
(1,   'Redes y Comunicaciones'          , 'Conocimiento sobre redes informáticas.'                  , 3                   , 4                     , 8            ),
(1,   'Diseño Gráfico Digital'          , 'Curso creativo para diseñadores.'                        , 3                   , 4                     , 9            ),
(1,   'Marketing Estratégico'           , 'Curso avanzado en marketing.'                            , 3                   , 4                     , 9            ),
(1,   'Introducción a la IA'            , 'Conceptos básicos sobre inteligencia artificial.'        , 3                   , 4                     , 8            ),
(1,   'Gestión de Proyectos'            , 'Curso para aprender sobre la gestión de proyectos.'      , 3                   , 4                     , 9            ),
(2,   'Curso Intermedio de Matemáticas' , 'Ampliación de fundamentos matemáticos.'                  , 3                   , 4                     , 8            ),
(3,   'Física Avanzada'                 , 'Conocimientos avanzados en física.'                      , 3                   , 4                     , 9            ),
(4,   'Francés Básico'                  , 'Introducción al idioma francés.'                         , 6                   , 6                     , 7            ),
(5,   'Gestión Empresarial'             , 'Administración y liderazgo empresarial.'                 , 3                   , 4                     , 8            ),
(6,   'Curso de Fotografía'             , 'Exploración del mundo de la fotografía.'                 , 3                   , 4                     , 7            ),
(7,   'Marketing Digital'               , 'Estrategias en redes sociales y más.'                    , 3                   , 4                     , 9            ),
(8,   'Avances en IA'                   , 'Temas especializados en inteligencia artificial.'        , 3                   , 4                     , 9            ),
(9,   'Desarrollo de Software'          , 'Principios y prácticas en desarrollo.'                   , 3                   , 4                     , 8            ),
(10,   'Cursos Prácticos de Diseño'     , 'Creación de proyectos de diseño gráfico.'                , 3                   , 4                     , 9            ),
(1,   'Gestión de Equipos'              , 'Formación en manejo y liderazgo de equipos.'             , 3                   , 4                     , 9            );

INSERT INTO Factura (Id_factura,Id_curso, Id_persona, Monto_total, Id_metodo_pago) VALUES
(1, 1, 1, 1000.00, 1),
(2, 2, 2, 1200.00, 2),
(3, 3, 3, 1500.00, 3),
(4, 4, 4, 1800.00, 4),
(5, 5, 5, 2000.00, 1),
(6, 6, 6, 2200.00, 2),
(7, 7, 7, 2500.00, 3),
(8, 8, 8, 2800.00, 4),
(9, 9, 9, 3000.00, 1),
(10, 10, 10, 3200.00, 2),
(11, 11, 11, 3500.00, 3),
(12, 12, 12, 3800.00, 4),
(13, 13, 13, 4100.00, 1),
(14, 14, 14, 4400.00, 2),
(15, 15, 15, 4700.00, 3),
(16, 16, 16, 5000.00, 4),
(17, 17, 17, 5300.00, 1),
(18, 18, 18, 5600.00, 2),
(19, 19, 19, 5900.00, 3),
(20, 20, 20, 6200.00, 4);


INSERT INTO Estudiante_curso (Id_estudiante,Id_curso, Id_catalogo_curso) VALUES
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

INSERT INTO Nota (Id_estudiante_curso, Nota) VALUES
( 1, 85),
( 2, 90),
( 3, 95),
( 4, 80),
( 5, 75),
( 6, 70),
( 7, 65),
( 8, 60),
( 9, 55),
(10, 50),
( 1, 88),
( 2, 92),
( 3, 97),
( 4, 81),
( 5, 78),
( 6, 72),
( 7, 68),
( 8, 64),
( 9, 59),
( 10, 54);
