-- database: ../../Data_Base/policurso.sqlite
DROP TABLE IF EXISTS NOTA;
DROP TABLE IF EXISTS Estudiante_curso;
DROP TABLE IF EXISTS Modulo_actividad;
DROP TABLE IF EXISTS Actividad_tipo;
DROP TABLE IF EXISTS Modulo;
DROP TABLE IF EXISTS Curso;
DROP TABLE IF EXISTS Persona;
DROP TABLE IF EXISTS CATALOGO;
DROP TABLE IF EXISTS CATALOGO_TIPO;
CREATE TABLE CATALOGO_TIPO(
    id_tipo INTEGER NOT NULL PRIMARY KEY
    ,nombre VARCHAR(20) NOT NULL
    ,estado VARCHAR(1) DEFAULT ('A') CONSTRAINT verficador CHECK(estado IN ('A','I')) 
    ,fecha_creacion DATETIME DEFAULT (datetime('now','localtime'))
    ,fecha_modificacion DATETIME
);
CREATE TABLE CATALOGO(
    id_catalogo INTEGER NOT NULL PRIMARY KEY
    ,nombre VARCHAR(20) NOT NULL
    ,estado VARCHAR(1) NOT NULL DEFAULT ('A') CONSTRAINT verficador CHECK(estado IN ('A','I'))
    ,fecha_creacion DATETIME DEFAULT (datetime('now','localtime'))
    ,fecha_modificacion DATETIME
    ,id_tipo INTEGER NOT NULL REFERENCES CATALOGO_TIPO(id_tipo)
    ,id_padre INTEGER  REFERENCES CATALOGO(id_catalogo)
);
CREATE TABLE Persona(
    id_persona INTEGER  NOT NULL PRIMARY KEY AUTOINCREMENT
    ,nombre VARCHAR(50) NOT NULL
    ,apellido VARCHAR(50) NOT NULL
    ,correo TEXT NOT NULL
    ,descripcion TEXT
    ,clave  TEXT NOT NULL
    ,id_catalogo_pais INTEGER NOT NULL REFERENCES CATALOGO(id_catalogo)
    ,fecha_nacimiento DATE NOT NULL
    ,estado VARCHAR(1) NOT NULL DEFAULT ('A') CONSTRAINT verficador CHECK(estado IN ('A','I'))
    ,fecha_creacion DATETIME DEFAULT (datetime('now','localtime'))
    ,fecha_modificacion DATETIME
);
CREATE TABLE Curso(
    id_curso INTEGER  NOT NULL PRIMARY KEY AUTOINCREMENT
    ,id_tutor INTEGER NOT NULL REFERENCES Persona(id_persona)
    ,nombre TEXT NOT NULL
    ,descripcion TEXT
    ,id_catalogo_categoria INTEGER NOT NULL REFERENCES CATALOGO(id_catalogo)
    ,id_catalogo_subcategoria INTEGER NOT NULL REFERENCES CATALOGO(id_catalogo)
    ,id_catalogo_idioma INTEGER NOT NULL REFERENCES CATALOGO(id_catalogo)
    ,id_catalogo_nivel INTEGER NOT NULL REFERENCES CATALOGO(id_catalogo)
    ,fecha_inicio DATETIME NOT NULL
    ,fecha_fin DATETIME NOT NULL
    ,Nota_aprobacion INTEGER NOT NULL
    ,Duracion INTEGER NOT NULL
    ,estado VARCHAR(1) NOT NULL DEFAULT ('A') CONSTRAINT verficador CHECK(estado IN ('A','I'))
    ,fecha_creacion DATETIME DEFAULT (datetime('now','localtime'))
    ,fecha_modificacion DATETIME
);

CREATE TABLE Modulo(
    id_modulo INTEGER  NOT NULL PRIMARY KEY AUTOINCREMENT
    ,id_curso INTEGER NOT NULL REFERENCES Curso(id_curso)
    ,nombre VARCHAR(25) NOT NULL
    ,descripcion TEXT
    ,estado VARCHAR(1) NOT NULL DEFAULT ('A') CONSTRAINT verficador CHECK(estado IN ('A','I'))
    ,fecha_creacion DATETIME DEFAULT (datetime('now','localtime'))
    ,fecha_modificacion DATETIME
);
CREATE TABLE Actividad_tipo(
    id_actividad INTEGER  NOT NULL PRIMARY KEY AUTOINCREMENT
    ,nombre VARCHAR(25) NOT NULL
    ,descripcion TEXT
    ,estado VARCHAR(1) NOT NULL DEFAULT ('A') CONSTRAINT verficador CHECK(estado IN ('A','I'))
    ,fecha_creacion DATETIME DEFAULT (datetime('now','localtime'))
    ,fecha_modificacion DATETIME
);
CREATE TABLE Modulo_actividad(
    id_modulo_actividad INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT
    ,id_actividad INTEGER NOT NULL REFERENCES Actividad_tipo(id_actividad)
    ,id_modulo INTEGER NOT NULL REFERENCES Modulo(id_modulo)
    ,descripcion TEXT
    ,fecha_inicio DATETIME NOT NULL
    ,fecha_fin DATETIME NOT NULL
    ,Nota_max INTEGER NOT NULL
    ,Ponderacion INTEGER NOT NULL
    ,estado VARCHAR(1) NOT NULL DEFAULT ('A') CONSTRAINT verficador CHECK(estado IN ('A','I'))
    ,fecha_creacion DATETIME DEFAULT (datetime('now','localtime'))
    ,fecha_modificacion DATETIME
);
CREATE TABLE Estudiante_curso(
    id_estudiante_curso INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT
    ,id_estudiante INTEGER NOT NULL REFERENCES Persona(id_persona)
    ,id_curso  INTEGER NOT NULL REFERENCES Curso(id_curso)
    ,id_catalogo_curso INTEGER NOT NULL REFERENCES CATALOGO(id_catalogo)
);
CREATE TABLE Nota (
    id_nota INTEGER NOT NULL PRIMARY KEY
    ,id_modulo_actividad INTEGER NOT NULL REFERENCES Modulo_actividad(id_modulo_actividad)
    ,id_estudiante_curso INTEGER NOT NULL REFERENCES Estudiante_curso(id_estudiante_curso)
    ,Nota INTEGER NOT NULL
    ,estado VARCHAR(1) NOT NULL DEFAULT ('A') CONSTRAINT verficador CHECK(estado IN ('A','I'))
    ,fecha_creacion DATETIME DEFAULT (datetime('now','localtime'))
    ,fecha_modificacion DATETIME
);
