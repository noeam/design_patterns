# Objetivo: El objetivo de esta práctica es implementar adecuadamente alguno de los patrones *Factory, Abstract Factory o Builder* en la resolución del problema propuesto.

1. Menciona los principios de diseño esenciales de los patrones Factory, Abstract
Factory y Builder. Menciona una desventaja de cada patrón.

2. Se te ha encargado implementar una solución para el siguiente problema:
Una fábrica de autos estilo Mad Max desea usar un sistema para la construcción de sus
productos. Los autos se componen de llantas, motor, carrocería, blindaje y armas. Existen
los siguientes componentes:

- Llantas: simple, deportivas, off-road, oruga de tanque

- Motor: deportivo, diesel, turbo

- Carrocería: casual, camión, deportiva

- Blindaje: simple, reforzado, tanque

- Armas: arpones, lanzallamas, cañones, sierra, metralleta

Cada auto tiene 4 características: ataque, defensa, velocidad y costo que se ven en
afectadas por los componentes que se eligen.

Asigna los valores a cada tipo de componente. Implementa un sistema que te permita crear
un auto al gusto del usuario. Cada usuario comenzará con un determinado monto de dinero
para la construcción de su auto.

Además, implementa una función para generar 3 autos diferentes default con los
componentes que tu decidas. Esta función sirve para usuarios poco creativos que necesitan
un auto inmediatamente.

Para la prueba se requiere de un menú interactivo con las opciones mencionadas.
En el archivo README justifica adecuadamente el patrón que decidiste usar para la
implementación de tu solución.

> Nota: Factory, Abstract Factory y Builder NO son patrones complementarios. Usa sólo UNO de los tres para resolver este problema.

Realiza los diagramas de clase necesarios
