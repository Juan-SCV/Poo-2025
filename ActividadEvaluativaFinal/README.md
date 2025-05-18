# Juego de Lucha

Para realizar este proyecto tome mucha inspiracion de juegos rpg con sistemas de combate por turnos la base del juego estaba muy clara y se prestaba para mucha imaginacion por nuestra parte al principio pense en utilizar el sistema de combate propuesto de aleatorizar los puntos de daño realizado pero me parecia un sistema que reducia la posibilidad de añadir cosas que podrian abrir el juego y hacerlo mas interesante por eso una de las primeras cosas que pense fue en realizar digamos ese cambio de mecanicas para hacer que el daño dependiera de las armas individuales de cada personaje esto hizo que tuviera que añadir la clase arma como un atributo de los personajes porque tambien pensaba en darle una habilidad a las armas aunque eso termino siendo caracteristico de los personajes y no de las armas, las armas se pensaron despues de crear los cuatro personajes del juego que fueron lo primero que se creo y unicamente heredan los metodos de ataque de la clase personaje y despues se replantea en base a las habilidades unicas que iban a tener. una vez todos estas clases se pensaron simplemente era arreglar la progresion del juego de lucha y los casos de ejecucion en el main 

## Estructura del Proyecto

El proyecto se compone de las siguientes clases principales:

### 1. **Clase `Personaje`**

La clase `Personaje` es la clase base para todos los personajes en el juego. Cada personaje tiene un **nombre**, **puntos de vida** y un **arma** que utiliza para atacar.

#### Atributos:
- `nombre`: Nombre del personaje.
- `puntosDeVida`: Puntos de vida actuales del personaje.
- `arma`: Objeto de la clase `Arma` que representa el arma que el personaje utiliza.

#### Métodos:
- `atacar(Personaje oponente)`: Realiza un ataque al oponente. Calcula el daño utilizando el arma del personaje y se lo resta al oponente.
- `recibirDaño(int daño)`: Resta la cantidad de daño recibida de los puntos de vida del personaje.
- `estaVivo()`: Retorna `true` si el personaje sigue vivo (es decir, si tiene más de 0 puntos de vida), de lo contrario retorna `false`.
- `getNombre()`: Retorna el nombre del personaje.
- `getPuntosDeVida()`: Retorna los puntos de vida actuales del personaje.

### 2.A **Clase `Guerrero`**

La clase `Guerrero` extiende de `Personaje` y representa un personaje con un arma específica: una **Espada de dos manos**. El Guerrero no tiene habilidades especiales, solo puede atacar con su espada y recibir daño como cualquier otro personaje.

#### Atributos:
- **Stats base**: 120 puntos de vida.
- **Arma**: Espada de dos manos, con un rango de daño entre 12 y 30.

### 2.B 🔮 `Mago`

- **Arma**: Bastón mágico.  
- **HP Base**: 80.  
- **Habilidad especial**: Tiene un **30% de probabilidad** de lanzar un **segundo hechizo** que inflige daño adicional.

**Notas**:
- Es un personaje ofensivo con baja vida.
- Ideal para jugadores que prefieren **riesgo y daño explosivo**.

### 2.C ✝️ `Paladín`

- **Arma**: Espada de una mano y escudo.  
- **HP Base**: 110.  
- **Habilidad especial**: Cada vez que ataca, el Paladín **se cura entre 5 y 10 puntos de vida**.

**Notas**:
- Combina ataque moderado con **sostenibilidad** en combate.
- Su estilo favorece enfrentamientos prolongados gracias a su curación pasiva.
- Ideal para jugadores que prefieren personajes **defensivos con recuperación automática**.

### 2.D 🗡️ `Asesino`

- **Arma**: Dagas.  
- **HP Base**: 90.  
- **Habilidad especial**: Aplica **daño por sangrado** que **aumenta progresivamente** en cada turno.

**Notas**:
- El sangrado inflige daño adicional acumulativo con cada ataque.
- Su potencial de daño escala a lo largo de la pelea.
- Ideal para jugadores que prefieren un estilo **agresivo y estratégico**.

### 3. **Clase `Arma`**

La clase `Arma` representa el arma de un personaje. Cada arma tiene un nombre y un rango de daño.

#### Atributos:
- `nombre`: El nombre del arma (por ejemplo, "Espada de dos manos").
- `dañoMinimo`: El daño mínimo que puede causar el arma.
- `dañoMaximo`: El daño máximo que puede causar el arma.

#### Métodos:
- `calcularDaño()`: Retorna un valor aleatorio dentro del rango de daño de esa arma.

### 4. **Clase `JuegoLucha`**

La clase `JuegoLucha` maneja el flujo del combate entre dos personajes. Se encarga de iniciar la pelea y alternar los turnos de ataque entre los personajes hasta que uno de ellos quede sin puntos de vida.

#### Métodos:
- `iniciarPelea(Personaje p1, Personaje p2)`: Inicia la pelea entre dos personajes. Los personajes se atacan de forma alterna hasta que uno de ellos pierda todos sus puntos de vida.
- `mostrarEstado(Personaje p1, Personaje p2)`: Muestra el estado actual de ambos personajes (nombre y puntos de vida) después de cada turno.

### 5. **Clase `Main`**

La clase `Main` contiene el método `main()` que se encarga de crear los personajes y ejecutar el juego de lucha.

#### Métodos:
- `main(String[] args)`: El punto de entrada del programa. Crea dos personajes (en este caso un Guerrero y un Asesino) y ejecuta el juego de lucha entre ellos.

---

## Flujo del Juego

1. El juego comienza creando dos personajes.
2. Cada personaje realiza un ataque a su oponente de manera alterna.
3. El daño de cada ataque es calculado aleatoriamente según el arma del personaje.
4. Después de cada ataque, el estado de ambos personajes (nombre y puntos de vida) se muestra en consola.
5. El juego continúa hasta que uno de los personajes se quede sin puntos de vida, lo que determina al ganador.

### Ejemplo de ejecución:

```java
public class Main {
    public static void main(String[] args) {
        // Crear los personajes
        Personaje jugador1 = new Guerrero("NombreA");  // Guerrero con stats base
        Personaje jugador2 = new Asesino("NombreB");  // Oponente Asesino

        // Iniciar el juego de lucha
        JuegoLucha juego = new JuegoLucha();
        juego.iniciarPelea(jugador1, jugador2);  // Comienza la pelea
    }
}

### ⚔️ Primer Combate:
- Este es un caso de ejecución entre la clase **`Paladin`** y **`Mago`**.

#### 🧪 Descripción:
Aca se puede ver como se desarrolla un combate por turnos entre un **Paladín** cuyo poder le permite curarse una pequeña cantidad de vida cada vez que ataca y un **Mago** que tiene la probabilidad de realizar un segundo ataque mágico a la par que tiene un alto daño de ataque a costa de pocos puntos de vida cada turno se puede ver la accion realizada y el como interactua la habilidad unica del personaje si se llega a dar como cuando el mago ataca dos veces y la curacion del paladin el combate termina en victoria del mago.

#### 📋 Registro del Combate:

Paladin ataca con Espada de una mano y escudo y causa 17 de daño. Se cura 4 HP.
Estado actual:
Paladin: 114 HP
Mago: 63 HP

Mago ataca con Bastón mágico y causa 15 de daño.
Mago lanza un segundo hechizo con Bastón mágico causando 21 de daño extra.
Estado actual:
Paladin: 78 HP
Mago: 63 HP

Paladin ataca con Espada de una mano y escudo y causa 14 de daño. Se cura 5 HP.
Estado actual:
Paladin: 83 HP
Mago: 49 HP

Mago ataca con Bastón mágico y causa 23 de daño.
Mago lanza un segundo hechizo con Bastón mágico causando 16 de daño extra.
Estado actual:
Paladin: 44 HP
Mago: 49 HP

Paladin ataca con Espada de una mano y escudo y causa 20 de daño. Se cura 6 HP.
Estado actual:
Paladin: 50 HP
Mago: 29 HP

Mago ataca con Bastón mágico y causa 16 de daño.
Mago lanza un segundo hechizo con Bastón mágico causando 18 de daño extra.
Estado actual:
Paladin: 16 HP
Mago: 29 HP

Paladin ataca con Espada de una mano y escudo y causa 9 de daño. Se cura 5 HP.
Estado actual:
Paladin: 21 HP
Mago: 20 HP

Mago ataca con Bastón mágico y causa 12 de daño.
Estado actual:
Paladin: 9 HP
Mago: 20 HP

Paladin ataca con Espada de una mano y escudo y causa 9 de daño. Se cura 5 HP.
Estado actual:
Paladin: 14 HP
Mago: 11 HP

Mago ataca con Bastón mágico y causa 17 de daño.
Estado actual:
Paladin: 0 HP
Mago: 11 HP

Mago ha ganado la pelea.

### ⚔️ Segundo Combate:
- Este es un caso de ejecución entre la clase **`Asesino`** y **`Guerrero`**.

#### 🧪 Descripción:
Aca se pueden observar las dos clases faltantes que cree el **Asesino** y el **Guerrero** el guerrero tiene las estadisticas mas altas de las 4 clases para balancear su falta de habilidad unica y el asesino aplica un sangrado con sus ataques que se acumula

#### 📋 Registro del Combate:

¡Comienza la pelea entre Asesino y Guerrero!

Asesino ataca con Dagas y causa 16 de daño.
Estado actual:
Asesino: 90 HP
Guerrero: 104 HP

Guerrero ataca con Espada de dos manos y causa 24 de daño.
Estado actual:
Asesino: 66 HP
Guerrero: 104 HP

Asesino ataca con Dagas y causa 15 de daño.
Asesino aplica sangrado y causa 4 de daño extra.
Estado actual:
Asesino: 66 HP
Guerrero: 85 HP

Guerrero ataca con Espada de dos manos y causa 15 de daño.
Estado actual:
Asesino: 51 HP
Guerrero: 85 HP

Asesino ataca con Dagas y causa 25 de daño.
Asesino aplica sangrado y causa 8 de daño extra.
Estado actual:
Asesino: 51 HP
Guerrero: 52 HP

Guerrero ataca con Espada de dos manos y causa 26 de daño.
Estado actual:
Asesino: 25 HP
Guerrero: 52 HP

Asesino ataca con Dagas y causa 24 de daño.
Asesino aplica sangrado y causa 12 de daño extra.
Estado actual:
Asesino: 25 HP
Guerrero: 16 HP

Guerrero ataca con Espada de dos manos y causa 20 de daño.
Estado actual:
Asesino: 5 HP
Guerrero: 16 HP

Asesino ataca con Dagas y causa 20 de daño.
Asesino aplica sangrado y causa 15 de daño extra.
Estado actual:
Asesino: 5 HP
Guerrero: 0 HP


Asesino ha ganado la pelea.

