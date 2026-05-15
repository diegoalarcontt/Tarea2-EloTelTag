# EloTelTag Simulation

Proyecto desarrollado en Java + JavaFX que simula un ecosistema tipo “Find My”, utilizando Programación Orientada a Objetos y desarrollo incremental por etapas.

---

# Descripción del Proyecto

La simulación representa un territorio interactivo donde existen distintos dispositivos tecnológicos:

* Celulares
* EloTelTags
* Tablets

Cada dispositivo puede desplazarse automáticamente dentro del territorio, detectar otros dispositivos cercanos y registrar eventos en una nube simulada llamada ETNube.

El sistema incorpora múltiples funcionalidades visuales y dinámicas, incluyendo radar, monitoreo en tiempo real y estadísticas.

---

# Tecnologías Utilizadas

* Java
* JavaFX 21
* Git
* GitHub
* Visual Studio Code

---

# Estructura del Proyecto

```text
Etapa1/
Etapa2/
Etapa3/
Etapa4/
```

Cada etapa representa una versión incremental del sistema.

---

# Funcionalidades Implementadas

## Etapa 1

* Simulación gráfica básica.
* Movimiento automático de dispositivos.
* Rebote en bordes.
* Lectura desde archivo `config.txt`.
* Fondo gráfico del territorio.

---

## Etapa 2

* Implementación de EloTelTags.
* Implementación de Tablets.
* Sistema ETNube.
* Radar visual.
* Menú Play/Pause.
* Funcionalidad Find My.

---

## Etapa 3

* ETNube dinámica.
* Find My en tiempo real.
* Actualización automática de eventos.
* Registro dinámico de actividad.

---

## Etapa 4

* Detección automática de proximidad.
* Estadísticas en tiempo real.
* Monitoreo inteligente.
* Reportes automáticos.
* Simulación avanzada tipo Find My.

---

# Programación Orientada a Objetos

El proyecto implementa conceptos fundamentales de POO:

## Herencia

Las clases:

* Cellular
* EloTelTag
* Tablet

heredan de la clase base `Equipo`.

---

## Encapsulamiento

Las clases utilizan atributos privados y métodos getters.

---

## Composición

La clase `Territory` contiene listas de dispositivos.

---

## Polimorfismo

Los distintos dispositivos utilizan comportamiento compartido desde `Equipo`.

---

# Clases Principales

| Clase         | Función                        |
| ------------- | ------------------------------ |
| Equipo        | Clase base de movimiento       |
| Cellular      | Representa celulares           |
| EloTelTag     | Representa tags tipo AirTag    |
| Tablet        | Representa tablets             |
| Territory     | Almacena dispositivos          |
| TerritoryView | Visualización gráfica          |
| ETNube        | Sistema de reportes            |
| Stage1        | Inicio de la aplicación JavaFX |

---

# ETNube

ETNube simula un sistema de nube encargado de:

* almacenar eventos;
* registrar detecciones;
* mantener historial;
* contabilizar detecciones automáticas.

---

# Find My

La funcionalidad Find My permite:

* click derecho sobre dispositivos;
* visualizar información;
* monitorear posiciones en tiempo real.

---

# Panel de Estadísticas

La simulación incorpora un panel dinámico que muestra:

* cantidad de celulares;
* cantidad de tags;
* cantidad de tablets;
* número de detecciones.

---

# Cómo Ejecutar el Proyecto

## 1. Abrir terminal en src

Ejemplo:

```bash
cd Etapa4/src
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

* Play → inicia simulación.
* Pause → pausa simulación.
* Ver ETNube → muestra reportes y eventos.

---

## Find My

Click derecho sobre un celular para visualizar:

* nombre del dueño;
* posición X;
* posición Y;
* actualización en tiempo real.

---

# GitHub

El proyecto utiliza Git y GitHub para:

* control de versiones;
* respaldo;
* organización por etapas.

---

# Autores

- Diego Alarcón
- Ivan Carlson
- Joaquin Cordero

---

# Estado Actual del Proyecto

El sistema se encuentra completamente funcional e incorpora:

* simulación avanzada;
* detección automática;
* monitoreo dinámico;
* interfaz gráfica;
* estadísticas;
* integración con ETNube.

El proyecto puede continuar escalándose con nuevas funcionalidades y mejoras visuales.
