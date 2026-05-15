# EloTelTag Simulation

Proyecto desarrollado en Java + JavaFX para simular un ecosistema tipo “Find My” utilizando Programación Orientada a Objetos.

---

# Descripción

La simulación representa un territorio donde existen:

- Celulares
- EloTelTags
- Tablets

Cada dispositivo puede desplazarse dentro del mapa y ser detectado mediante señales visuales tipo radar.

El sistema incorpora:

- Simulación gráfica con JavaFX
- Movimiento automático
- Rebote en bordes
- ETNube
- Find My
- Radar de detección
- Menú Play/Pause
- Lectura desde archivo config.txt

---

# Tecnologías utilizadas

- Java
- JavaFX 21
- Git
- GitHub
- Visual Studio Code

---

# Estructura del proyecto

```text
Etapa1/
Etapa2/
Etapa3/
```

Cada etapa representa una versión incremental del proyecto.

---

# Funcionalidades implementadas

## Etapa 1
- Simulación básica
- Movimiento de dispositivos
- Visualización gráfica

## Etapa 2
- EloTelTags
- Tablets
- ETNube
- Find My
- Radar visual

## Etapa 3
- ETNube dinámica
- Find My en tiempo real
- Registro automático de eventos
- Mejoras visuales

---

# Cómo ejecutar el proyecto

## 1. Abrir terminal en src

Ejemplo:

```bash
cd Etapa3/src
```

---

## 2. Compilar

```bash
javac --module-path "RUTA_JAVAFX_LIB" --add-modules javafx.controls *.java
```

---

## 3. Ejecutar

```bash
java --module-path "RUTA_JAVAFX_LIB" --add-modules javafx.controls Stage1
```

---

# Controles

## Menú Simulation

- Play → inicia movimiento
- Pause → pausa simulación
- Ver ETNube → muestra registros del sistema

## Find My

Click derecho sobre un celular para visualizar:

- nombre
- posición en tiempo real

---

# Autor

Diego Alarcón

---

# Repositorio GitHub

Proyecto respaldado utilizando Git y GitHub.