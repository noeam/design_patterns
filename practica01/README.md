# *Objetivo:* El objetivo de esta práctica es implementar adecuadamente los patrones *Strategy y Observer* en la resolución del problema propuesto.

1. Menciona los principios de diseño esenciales de los patrones Observer y Strategy. Menciona una desventaja de cada patrón.

2. Diseña la implementación del siguiente problema:

Te solicitan crear un chat que funcionará en 3 países diferentes: España, México e Inglaterra. Todos los usuarios tienen un nombre para identificarse (Por el momento
supondremos que cada usuario tiene un nombre diferente y dos usuarios no tratarán de usar el mismo nombre).

Cada que un usuario es agregado al chat todos los otros usuarios son notificados con un mensaje correspondiente a su país, un usuario de España recibirá algo como “Habeis conseguido un nuevo compañero(a), saludad a Andrea”, uno de México recibirá un
mensaje más acorde a su país y uno de Inglaterra recibirá uno en inglés. También se avisará a todos los usuarios cuando alguno de ellos envíe un mensaje, e imprimirá el mensaje textualmente en el idioma en que se envió. Por último se avisará si un usuario abandona el chat.

La salida será en una misma terminal, ya que será una simulación. 
Sin embargo, antes de cada impresión en pantalla se indicará el nombre del que recibe el mensaje, por ejemplo
”Juan: Pepe se ha conectado al chat”

Realiza los diagramas de clase necesarios.
