-- database: ../Data_Base/policurso.sqlite
DROP TABLE IF EXISTS Factura;
DROP TABLE IF EXISTS MetodoPago;
DROP TABLE IF EXISTS NOTA;
DROP TABLE IF EXISTS Estudiante_curso;
DROP TABLE IF EXISTS Modulo_actividad;
DROP TABLE IF EXISTS Curso;
DROP TABLE IF EXISTS Persona;
DROP TABLE IF EXISTS CATALOGO;
DROP TABLE IF EXISTS CATALOGO_TIPO;
DROP TABLE IF EXISTS Rol;
DROP TABLE IF EXISTS Sexo;

CREATE TABLE Rol (
     Id_rol INTEGER PRIMARY KEY AUTOINCREMENT
    ,Nombre VARCHAR(20) NOT NULL UNIQUE
    ,Estado VARCHAR(1) DEFAULT ('A') CONSTRAINT verficador CHECK(Estado IN ('A','I')) 
    ,Fecha_creacion DATETIME DEFAULT (datetime('now','localtime'))
    ,Fecha_modificacion DATETIME
);

CREATE TABLE Sexo (
     Id_sexo INTEGER PRIMARY KEY AUTOINCREMENT
    ,Nombre VARCHAR(20) NOT NULL UNIQUE
    ,Estado VARCHAR(1) DEFAULT ('A') CONSTRAINT verficador CHECK(Estado IN ('A','I')) 
    ,Fecha_creacion DATETIME DEFAULT (datetime('now','localtime'))
    ,Fecha_modificacion DATETIME
);

CREATE TABLE Factura (
     Id_factura INTEGER PRIMARY KEY AUTOINCREMENT
    ,Id_curso INTEGER  NOT NULL REFERENCES Curso(Id_curso)
    ,Id_persona INTEGER NOT NULL REFERENCES Persona(Id_persona)
    ,Monto_total DECIMAL(10, 2)
    ,Id_metodo_pago INTEGER NOT NULL REFERENCES MetodoPago(Id_metodo_pago)
    ,Estado VARCHAR(1) DEFAULT ('A') CONSTRAINT verficador CHECK(Estado IN ('A','I')) 
    ,Fecha_creacion DATETIME DEFAULT (datetime('now','localtime'))
    ,Fecha_modificacion DATETIME
);

CREATE TABLE MetodoPago (
     Id_metodo_pago INTEGER PRIMARY KEY AUTOINCREMENT
    ,Nombre VARCHAR(20) NOT NULL UNIQUE
    ,Estado VARCHAR(1) DEFAULT ('A') CONSTRAINT verficador CHECK(Estado IN ('A','I')) 
    ,Fecha_creacion DATETIME DEFAULT (datetime('now','localtime'))
    ,Fecha_modificacion DATETIME
);


CREATE TABLE CATALOGO_TIPO(
     Id_tipo INTEGER NOT NULL PRIMARY KEY
    ,Nombre VARCHAR(20) NOT NULL
    ,Estado VARCHAR(1) DEFAULT ('A') CONSTRAINT verficador CHECK(Estado IN ('A','I')) 
    ,Fecha_creacion DATETIME DEFAULT (datetime('now','localtime'))
    ,Fecha_modificacion DATETIME
);
CREATE TABLE CATALOGO(
     Id_catalogo INTEGER NOT NULL PRIMARY KEY
    ,Nombre VARCHAR(20) NOT NULL
    ,Estado VARCHAR(1) NOT NULL DEFAULT ('A') CONSTRAINT verficador CHECK(Estado IN ('A','I'))
    ,Fecha_creacion DATETIME DEFAULT (datetime('now','localtime'))
    ,Fecha_modificacion DATETIME
    ,Id_tipo INTEGER NOT NULL REFERENCES CATALOGO_TIPO(Id_tipo)
    ,Id_padre INTEGER  REFERENCES CATALOGO(Id_catalogo)
);


CREATE TABLE Persona(
     Id_persona INTEGER  NOT NULL PRIMARY KEY AUTOINCREMENT
    ,Id_rol INTEGER NOT NULL REFERENCES Rol(Id_rol)
    ,Id_sexo INTEGER NOT NULL REFERENCES Sexo(Id_sexo)
    ,Cedula VARCHAR(10) NOT NULL UNIQUE
    ,Nombre VARCHAR(50) NOT NULL
    ,Apellido VARCHAR(50) NOT NULL
    ,Correo TEXT 
    ,Descripcion TEXT
    ,Clave  TEXT NOT NULL
    ,Id_catalogo_pais INTEGER NOT NULL REFERENCES CATALOGO(Id_catalogo)
    ,Fecha_nacimiento DATE
    ,Estado VARCHAR(1) NOT NULL DEFAULT ('A') CONSTRAINT verficador CHECK(Estado IN ('A','I'))
    ,Fecha_creacion DATETIME DEFAULT (datetime('now','localtime'))
    ,Fecha_modificacion DATETIME
);



CREATE TABLE Curso(
     Id_curso INTEGER  NOT NULL PRIMARY KEY AUTOINCREMENT
    ,Id_tutor INTEGER NOT NULL REFERENCES Persona(Id_persona)
    ,Nombre TEXT NOT NULL
    ,Descripcion TEXT
    ,Id_catalogo_categoria INTEGER NOT NULL REFERENCES CATALOGO(Id_catalogo)
    ,Id_catalogo_subcategoria INTEGER NOT NULL REFERENCES CATALOGO(Id_catalogo)
    ,Id_catalogo_nivel INTEGER NOT NULL REFERENCES CATALOGO(Id_catalogo)

    ,Estado VARCHAR(1) NOT NULL DEFAULT ('A') CONSTRAINT verficador CHECK(Estado IN ('A','I'))
    ,Fecha_creacion DATETIME DEFAULT (datetime('now','localtime'))
    ,Fecha_modificacion DATETIME
);


CREATE TABLE Modulo_actividad(
    Id_modulo_actividad INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT
    ,Id_actividad INTEGER NOT NULL REFERENCES Actividad_tipo(Id_actividad)
    ,Id_modulo INTEGER NOT NULL REFERENCES Modulo(Id_modulo)
    ,Descripcion TEXT
    ,Fecha_inicio DATETIME NOT NULL
    ,Fecha_fin DATETIME NOT NULL
    ,Nota_max INTEGER NOT NULL
    ,Ponderacion INTEGER NOT NULL
    ,Estado VARCHAR(1) NOT NULL DEFAULT ('A') CONSTRAINT verficador CHECK(Estado IN ('A','I'))
    ,Fecha_creacion DATETIME DEFAULT (datetime('now','localtime'))
    ,Fecha_modificacion DATETIME
);
CREATE TABLE Estudiante_curso(
    Id_estudiante_curso INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT
    ,Id_estudiante INTEGER NOT NULL REFERENCES Persona(Id_persona)
    ,Id_curso  INTEGER NOT NULL REFERENCES Curso(Id_curso)
    ,Id_catalogo_curso INTEGER NOT NULL REFERENCES CATALOGO(Id_catalogo)
);
CREATE TABLE Nota (
    Id_nota INTEGER NOT NULL PRIMARY KEY
    ,Id_estudiante_curso INTEGER NOT NULL REFERENCES Estudiante_curso(Id_estudiante_curso)
    ,Nota INTEGER NOT NULL
    ,Estado VARCHAR(1) NOT NULL DEFAULT ('A') CONSTRAINT verficador CHECK(Estado IN ('A','I'))
    ,Fecha_creacion DATETIME DEFAULT (datetime('now','localtime'))
    ,Fecha_modificacion DATETIME
);

