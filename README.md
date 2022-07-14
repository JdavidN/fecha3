¿Cómo creamos objetos de la clase Fecha pasándoles los valores del día, mes y año a través del constructor?

Fecha f = new Fecha();

Fecha = Clase fecha
f = Objeto 
new = operador
Fecha() = método

Un método está sobrecargado cuando admite más de una combinación de tipos y/o cantidades de argumentos o parámetros.

## Problema

crear fechas a partir de una cadena de carácteres con el formato dd/mm/aaaa

# ENCAPSULAMIENTO

## Ejercicio
Una operación aplicable a una fecha podría ser sumarle o restarle días. Si definimos el método `addDías` en la clase Fecha, quien utilice esta clase podrá sumarle días a sus fechas sin tener que conocer el algoritmo que resuelve el problema.

`// creamos una fecha`
`Fecha f = new Fecha("23/12/1980");`

`//Le sumamos 180 días`
`f.addDias(180);`

Para facilitar los cálculos se considera que todos los meses tienen 30 días.
Por tanto, los años tendrán 360 días.

El algoritmo para sumar días a una fecha consistirá en convertir la fecha a días, sumarle los días que corresponda y asignar los nuevos valores del día, mes y año en los atributos.

Métodos a programar:
- El método `addDias` será el método que vamos a exponer para que los usuarios de la clase puedan invocar y así sumarle días a sus fechas.
- Desarrollaremos también el método `fechaToDias` que retornará un entero para representar la fecha expresada en días. Este método no lo vamos a exponer. Es decir, no será visible para el usuario: será `private`.
- Por último desarrollaremos el método inverso: `diasToFecha` que, dado un valor entero que representa una fecha expresada en días, lo separará y asignará los valores que correspondan a los atributos `dia`, `mes` y `anio`. Este método tambien será `private` ya que no nos interesa que el usuario lo pueda invocar.


Caso Fecha

Supongamos que no tenemos acceso al código de la clase Fecha. Es decir, podemos utilizarla pero no la podemos modificar porque fue hecha por terceras partes. Hagamos de cuenta que no la desarrollamos nosotros. De este modo, supongamos que, aunque la clase Fecha nos resulta útil, funciona bien y es muy práctica, queremos modificar la forma en que una fecha se representa a si misma cuando invocamos su método toString.

La solución es crear una nueva clase (FechaDetallada) que hereda de Fecha y que modifique la manera en que esta se representa como cadena.

Ej. "12 de julio de 2022"
