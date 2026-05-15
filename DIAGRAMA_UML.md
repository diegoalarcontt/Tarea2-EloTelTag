# Diagrama de clases UML - EloTelTag Simulation

```text
                 ┌──────────────┐
                 │    Equipo    │
                 ├──────────────┤
                 │ - x          │
                 │ - y          │
                 │ - rapidez    │
                 │ - angulo     │
                 │ - deltaAngulo│
                 ├──────────────┤
                 │ + mover()    │
                 │ + getX()     │
                 │ + getY()     │
                 └──────┬───────┘
                        │
        ┌───────────────┼────────────────┐
        │               │                │
┌──────────────┐ ┌──────────────┐ ┌──────────────┐
│   Cellular   │ │  EloTelTag   │ │    Tablet    │
├──────────────┤ ├──────────────┤ ├──────────────┤
│ - ownerName  │ │ - nombre     │ │              │
├──────────────┤ ├──────────────┤ ├──────────────┤
│ + getOwner() │ │ + getNombre()│ │              │
└──────────────┘ └──────────────┘ └──────────────┘


┌────────────────┐
│   Territory    │
├────────────────┤
│ - celulares    │
│ - tags         │
│ - tablets      │
├────────────────┤
│ + addCellular()│
│ + addTag()     │
│ + addTablet()  │
└────────────────┘


┌──────────────────┐
│  TerritoryView   │
├──────────────────┤
│ - cellularViews  │
│ - tagViews       │
│ - tabletViews    │
│ - nube           │
├──────────────────┤
│ + actualizar()   │
└──────────────────┘


┌───────────────┐
│    ETNube     │
├───────────────┤
│ - reportes    │
│ - detecciones │
├───────────────┤
│ + agregarReporte() │
│ + obtenerTextoReportes() │
│ + getCantidadDetecciones() │
└───────────────┘