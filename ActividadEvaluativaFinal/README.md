# Juego de Lucha

Este proyecto implementa un juego de lucha entre personajes donde cada uno tiene una cantidad de puntos de vida (HP) y puede atacar al oponente con un ataque que causa un daño aleatorio. Los personajes luchan por turnos, y el primer personaje en quedarse sin puntos de vida pierde.

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
