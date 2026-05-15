# Documentación Técnica - EloTelTag Simulation

# 1. Introducción

EloTelTag Simulation es un proyecto desarrollado en Java y JavaFX que simula un ecosistema de rastreo de dispositivos similar a “Find My”.

El sistema permite visualizar celulares, tags y tablets moviéndose dentro de un territorio gráfico, detectando dispositivos cercanos y registrando eventos en una nube simulada llamada ETNube.

---

# 2. Objetivos del Proyecto

## Objetivo General

Desarrollar una simulación gráfica basada en Programación Orientada a Objetos utilizando JavaFX.

## Objetivos Específicos

- Implementar movimiento automático de dispositivos.
- Simular detección entre dispositivos.
- Implementar un sistema de nube para almacenamiento de eventos.
- Visualizar información en tiempo real.
- Utilizar herencia, encapsulamiento y composición.

---

# 3. Tecnologías Utilizadas

- Java
- JavaFX
- Git
- GitHub
- Visual Studio Code

---

# 4. Arquitectura del Sistema

El sistema se divide en:

## Modelo
Representa los datos y lógica del sistema.

Clases:
- Equipo
- Cellular
- EloTelTag
- Tablet
- Territory
- ETNube

## Vista
Representa los componentes gráficos.

Clases:
- CellularView
- EloTelTagView
- TabletView
- TerritoryView

## Control
Coordina la ejecución del programa.

Clase:
- Stage1

---

# 5. Funcionalidades Implementadas

## Etapa 1
- Simulación básica.
- Movimiento automático.
- Visualización gráfica.

## Etapa 2
- Implementación de EloTelTags.
- Sistema ETNube.
- Find My.
- Radar visual.

## Etapa 3
- Find My en tiempo real.
- ETNube dinámica.
- Reportes automáticos.

## Etapa 4
- Detección automática de proximidad.
- Panel de estadísticas.
- Registro inteligente de eventos.

---

# 6. Programación Orientada a Objetos

El proyecto utiliza:

## Herencia
- Cellular, EloTelTag y Tablet heredan de Equipo.

## Encapsulamiento
- Variables privadas con getters y setters.

## Composición
- Territory contiene listas de dispositivos.

## Polimorfismo
- Objetos derivados utilizan comportamiento compartido desde Equipo.

---

# 7. ETNube

ETNube simula un servicio de almacenamiento de eventos.

Funciones:
- almacenar reportes;
- registrar detecciones;
- mostrar historial;
- contabilizar eventos.

---

# 8. Find My

La funcionalidad Find My permite:

- click derecho sobre dispositivos;
- visualizar posición en tiempo real;
- monitorear movimiento dinámico.

---

# 9. Conclusión

El proyecto logró implementar exitosamente una simulación gráfica avanzada utilizando JavaFX y Programación Orientada a Objetos.

Además de cumplir con los requisitos principales, se añadieron funcionalidades avanzadas como:
- estadísticas;
- monitoreo en tiempo real;
- detección automática;
- integración con ETNube.

El resultado final corresponde a una simulación interactiva moderna y extensible.
