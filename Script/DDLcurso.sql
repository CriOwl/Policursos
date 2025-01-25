-- database: ../Data_Base/policurso.sqlite
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
    Id_tipo                 INTEGER NOT NULL PRIMARY KEY
    ,Nombre                 VARCHAR(20) NOT NULL
    ,Estado                 VARCHAR(1) DEFAULT ('A') CONSTRAINT verficador CHECK(Estado IN ('A','I')) 
    ,Fecha_creacion         DATETIME DEFAULT (datetime('now','localtime'))
    ,Fecha_modificacion     DATETIME
);
CREATE TABLE CATALOGO(
    Id_catalogo             INTEGER NOT NULL PRIMARY KEY
    ,Nombre                 VARCHAR(20) NOT NULL
    ,Estado                 VARCHAR(1) NOT NULL DEFAULT ('A') CONSTRAINT verficador CHECK(Estado IN ('A','I'))
    ,Fecha_creacion         DATETIME DEFAULT (datetime('now','localtime'))
    ,Fecha_modificacion     DATETIME
    ,Id_tipo                INTEGER NOT NULL REFERENCES CATALOGO_TIPO(Id_tipo)
    ,Id_padre               INTEGER  REFERENCES CATALOGO(Id_catalogo)
);
CREATE TABLE Persona(
    Id_persona              INTEGER  NOT NULL PRIMARY KEY AUTOINCREMENT
    ,Nombre                 VARCHAR(50) NOT NULL
    ,Apellido               VARCHAR(50) NOT NULL
    ,Correo                 TEXT NOT NULL
    ,Descripcion            TEXT
    ,Clave                  TEXT NOT NULL
    ,Id_catalogo_pais       INTEGER NOT NULL REFERENCES CATALOGO(Id_catalogo)
    ,Fecha_nacimiento       DATE NOT NULL
    ,Estado                 VARCHAR(1) NOT NULL DEFAULT ('A') CONSTRAINT verficador CHECK(Estado IN ('A','I'))
    ,Fecha_creacion         DATETIME DEFAULT (datetime('now','localtime'))
    ,Fecha_modificacion     DATETIME
);
CREATE TABLE Curso(
    Id_curso                      INTEGER  NOT NULL PRIMARY KEY AUTOINCREMENT
    ,Id_tutor                     INTEGER NOT NULL REFERENCES Persona(Id_persona)
    ,Nombre                       TEXT NOT NULL
    ,Descripcion                  TEXT
    ,Id_catalogo_categoria        INTEGER NOT NULL REFERENCES CATALOGO(Id_catalogo)
    ,Id_catalogo_subcategoria     INTEGER NOT NULL REFERENCES CATALOGO(Id_catalogo)
    ,Id_catalogo_idioma           INTEGER NOT NULL REFERENCES CATALOGO(Id_catalogo)
    ,Id_catalogo_nivel            INTEGER NOT NULL REFERENCES CATALOGO(Id_catalogo)
    ,Fecha_inicio                 DATETIME NOT NULL
    ,Fecha_fin                    DATETIME NOT NULL
    ,Nota_aprobacion              INTEGER NOT NULL
    ,Duracion                     INTEGER NOT NULL
    ,Estado                       VARCHAR(1) NOT NULL DEFAULT ('A') CONSTRAINT verficador CHECK(Estado IN ('A','I'))
    ,Fecha_creacion               DATETIME DEFAULT (datetime('now','localtime'))
    ,Fecha_modificacion           DATETIME
);

CREATE TABLE Modulo(
    Id_modulo                   INTEGER  NOT NULL PRIMARY KEY AUTOINCREMENT
    ,Id_curso                   INTEGER NOT NULL REFERENCES Curso(Id_curso)
    ,Nombre                     VARCHAR(25) NOT NULL
    ,Descripcion                TEXT
    ,Estado                     VARCHAR(1) NOT NULL DEFAULT ('A') CONSTRAINT verficador CHECK(Estado IN ('A','I'))
    ,Fecha_creacion             DATETIME DEFAULT (datetime('now','localtime'))
    ,Fecha_modificacion         DATETIME
);
CREATE TABLE Actividad_tipo(
    Id_actividad                INTEGER  NOT NULL PRIMARY KEY AUTOINCREMENT
    ,Nombre                     VARCHAR(25) NOT NULL
    ,descripcion                TEXT
    ,Estado                     VARCHAR(1) NOT NULL DEFAULT ('A') CONSTRAINT verficador CHECK(Estado IN ('A','I'))
    ,Fecha_creacion             DATETIME DEFAULT (datetime('now','localtime'))
    ,Fecha_modificacion         DATETIME
);
CREATE TABLE Modulo_actividad(
    Id_modulo_actividad         INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT
    ,Id_actividad               INTEGER NOT NULL REFERENCES Actividad_tipo(Id_actividad)
    ,Id_modulo                  INTEGER NOT NULL REFERENCES Modulo(Id_modulo)
    ,Descripcion                TEXT
    ,Fecha_inicio               DATETIME NOT NULL
    ,Fecha_fin                  DATETIME NOT NULL
    ,Nota_max                   INTEGER NOT NULL
    ,Ponderacion                INTEGER NOT NULL
    ,Estado                     VARCHAR(1) NOT NULL DEFAULT ('A') CONSTRAINT verficador CHECK(Estado IN ('A','I'))
    ,Fecha_creacion             DATETIME DEFAULT (datetime('now','localtime'))
    ,Fecha_modificacion         DATETIME
);
CREATE TABLE Estudiante_curso(
    Id_estudiante_curso         INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT
    ,Id_estudiante              INTEGER NOT NULL REFERENCES Persona(Id_persona)
    ,Id_curso                   INTEGER NOT NULL REFERENCES Curso(Id_curso)
    ,Id_catalogo_curso          INTEGER NOT NULL REFERENCES CATALOGO(Id_catalogo)
);
CREATE TABLE Nota (
    Id_nota                     INTEGER NOT NULL PRIMARY KEY
    ,Id_modulo_actividad        INTEGER NOT NULL REFERENCES Modulo_actividad(Id_modulo_actividad)
    ,Id_estudiante_curso        INTEGER NOT NULL REFERENCES Estudiante_curso(Id_estudiante_curso)
    ,Nota                       INTEGER NOT NULL
    ,Estado                     VARCHAR(1) NOT NULL DEFAULT ('A') CONSTRAINT verficador CHECK(Estado IN ('A','I'))
    ,Fecha_creacion             DATETIME DEFAULT (datetime('now','localtime'))
    ,Fecha_modificacion         DATETIME
);
