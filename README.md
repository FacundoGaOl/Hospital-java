## 🏥 Hospital System Management - Java POO
Este proyecto simula la gestión integral de un hospital, modelando la interacción entre diferentes tipos de pacientes y personal médico. Se ha puesto especial énfasis en la escalabilidad y el cumplimiento de los principios SOLID.

## 🏗️ Arquitectura y Diseño
Para este sistema, se ha implementado una jerarquía de clases de tres niveles para maximizar la reutilización de código y la claridad estructural:

* **Nivel 1** (Abstracción Total): Clase Character (Abstracta).

* **Nivel 2** (Especialización Base): Clases Patient y MedicalStaff (Abstractas).

* **Nivel 3** (Implementación Final):

AppointmentPatient y AmbulancePatient.

Specialist y Student.

Diagrama de Clases (UML)
El diseño sigue fielmente el esquema desarrollado en Draw.io, separando responsabilidades mediante interfaces.

## 🛠️ Tecnologías y Conceptos Aplicados
* **Java Vanilla:** Uso de tipos de datos, colecciones (Array) y estructuras de control.

* **Encapsulamiento:** Todos los atributos son private con sus respectivos Getters y Setters.

* **Polimorfismo:** Implementación del método description() que genera una salida única utilizando los atributos específicos de cada clase (como surgery en emergencias o holidays en especialistas).

* **Interfaces (Segregación de Interfaces):** Uso de Hospitalizable, MedicalTrace y Workable para definir comportamientos sin forzar a las clases a implementar métodos innecesarios.

## 📐 Principios SOLID Implementados
**S - Single Responsibility:** Cada clase tiene una única razón para cambiar (ej. Student solo gestiona datos académicos y de prácticas).

**O - Open/Closed:** El sistema está abierto a la extensión (podemos añadir una clase Nurse) pero cerrado a la modificación de las bases existentes.

**I - Interface Segregation:** Se han creado interfaces pequeñas en lugar de una sola interfaz gigante para el hospital.

## 🚀 Ejecución y Resultados
El sistema inicializa una colección de 8 objetos (2 de cada tipo) y los procesa de forma polimórfica para mostrar su estado actual en el hospital.

Salida por Terminal
Plaintext
===== HOSPITAL SYSTEM OUTPUT =====
------------------------------------
PACIENTE DE EMERGENCIA: Aragorn
 > ESTADO CRÍTICO | Habitación: ICU 01
 > Cirugía realizada: Leg Surgery
------------------------------------
MÉDICO ESPECIALISTA: Dr. Gregory House
 > Especialidad: Diagnostics
 > Turno: Day Shift | Vacaciones: 30 días.
