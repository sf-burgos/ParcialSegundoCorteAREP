# ParcialSegundoCorteAREP2
<img src="https://github.com/sf-burgos/ArquitecturaEmpresarial/blob/master/laboratorio1AREP-app/resources/Imagenes/BB.jpg" width="100" height="100">

##### **Presentado por:** **[Brayan Steven Burgos Delgado](https://www.linkedin.com/in/brayan-steven-burgos-delgado-21a9a0178/)**
##### Repositorio: [click aqui](https://github.com/sf-burgos/https://github.com/sf-burgos/ParcialSegundoCorteAREP)
## Objetivo:

Diseñé, construya y despliegue los siguientes servicios en un microcontenedor docker desplegado en una instancei a EC2 de AWS y otro desplegador en AWS lambda con AWS gateway. Cada estudiante debe seleccionar para desarrollar dos funciones matemáticas de acuerdo a los dos últimos dígitos de su cédula como se especifica en la lista (Si sus dos últimos dígitos de su cédula son el mismo use el siguiente dígito que sea diferente). Todas las funciones reciben un solo parámetro de tipo "Double" y retornan una parámetro de tipo "Double".


0. log

1. ln

2. sin

3. cos

4. tan

5. acos

6. asin

7. atan

8. sqrt

9. exp (el número de eauler elevado ala potendia del parámetro)


Implemente los servicios para responder al método de solicitud HTTP GET. Deben usar el nombre de la función especificado en la lista y el parámetro debe ser pasado en la variable de query con nombre "value".


Ejemplo de una llamado:

EC2
https://amazonxxx.x.xxx.x.xxx:{port}/cos?value=3.141592

Lambda + API Gateway
https://amazonxxx.x.xxx.x.xxx/sin?value=3.141592


Salida. El formato de la salida y la respuesta debe ser un JSON con el siguiente formato

{

"operation": "cos",

"input":  3.141592,

"output":  -0.999999

}


Entregable:

1. Proyecto actualizado en github (uno o dos repositorios, incluya referencias al repositorio alterno en el repositorio que entrega)

2. Descripción del proyecto enel README con pantalazos que muestren el funcionamiento.

3. Descripción de como correrlo en EC2 y cómo desplegarlo en lambda.

4. Video de menos de un minuto del funcionamiento (lo puede tomar con el celular una vez funcione)

## Desarrollo:

![](Resources/Screenshot_1.jpg)

![](Resources/Screenshot_2.jpg)

![](Resources/Screenshot_3.jpg)

![](Resources/Screenshot_4.jpg)

![](Resources/Screenshot_5.jpg)


#### PARA VER LOS VIDEOS PORFAVOR IR A ESTE LINK Y DESCARGAR LOS DOS (2 VIDEOS)
[click aqui](https://github.com/sf-burgos/ParcialSegundoCorteAREP/Resources/videos)




