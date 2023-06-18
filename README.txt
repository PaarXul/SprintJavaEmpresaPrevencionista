Problema:
El problema que enfrenta la compañía de asesorías en prevención de riesgos laborales es la falta de un sistema de información que les permita administrar la gran cantidad de datos generados y controlar eficientemente las actividades y el recurso humano. Esto ha llevado a diversos problemas en la planificación de visitas, falta de coordinación con los clientes durante las visitas en terreno, dificultad en el seguimiento de las asesorías, desbalances financieros por falta de control de los clientes que pagan y los que no, incumplimiento de ciertas actividades de control y dirección del trabajo, y falta de registro completo de las actividades preventivas realizadas y los avances.

Solución:
la solución propuesta para abordar el problema planteado consiste en desarrollar un sistema de información basado en software que permita administrar y controlar los procesos de la compañía de asesorías en prevención de riesgos laborales, así como mejorar la gestión, el control y la disponibilidad de la información.

El sistema debe abarcar diferentes aspectos y funcionalidades para cumplir con los requisitos establecidos. A continuación, se detallan las principales características y componentes de la solución:

Desarrollo de clases y métodos: se deben desarrollar las clases correspondientes a cada entidad, implementando los atributos y métodos necesarios. Además, se deben tener en cuenta las relaciones entre las entidades, como la asociación entre Cliente y Capacitación, Cliente y Accidente, y Visita en terreno y Revisión. Cada clase debe tener métodos para acceder y modificar los atributos, así como métodos adicionales según los requisitos planteados, como mostrar detalles de una capacitación o analizar un usuario.

Implementación de la interface: Se debe crear una interface llamada Asesoría, que declare el método analizarUsuario(). Esta interface debe ser implementada por la clase Usuario, y asegurar que se cumpla el contrato definido por el método.

Clase Contenedor: Se debe crear la clase Contenedor, que contendrá dos listas: una lista de instancias de la interface Asesoría y una lista de objetos de la clase Capacitación. Esta clase permitirá almacenar y administrar clientes, profesionales, administrativos y capacitaciones. Debe incluir métodos para agregar y eliminar usuarios, listar usuarios, listar usuarios por tipo, listar capacitaciones, entre otros.

Interfaz de usuario: Es importante desarrollar una interfaz de usuario intuitiva y amigable que permita interactuar con el sistema. La interfaz debe proporcionar las opciones del menú principal, mostrar los datos de los usuarios y capacitaciones, permitir la entrada de datos y mostrar los resultados de las consultas realizadas.

Validaciones de datos: Durante el proceso de desarrollo, se deben implementar validaciones de datos para garantizar la integridad y consistencia de la información ingresada. Se deben verificar las restricciones de longitud, formato y valores permitidos para cada atributo, asegurando que se cumplan los requisitos establecidos.
