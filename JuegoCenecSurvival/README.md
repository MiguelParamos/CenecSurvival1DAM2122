# CenecSurvival1DAM2122
Hacemos un pequeÃ±o juego en programaciÃ³n orientada a objetos, en el que los alumnos y profesores lucharemos a muerte

Un juego en el que todos los alumnos luchemos a muerte
dos a dos. Se escogen dos alumnos al azar, y solo 
puede quedar uno. Así hasta que solo sobreviva el campeón/na

Cada alumno va a tener un arma a su elección, y un objeto para defenderse. 
Las armas tendrán unos puntos de ataque
Los objetos defensivos unos puntos de defensa
Cada uno de nosotros tendrá 100 puntos de vida.

Las batallas se desarrollan atacando por turnos:
-Quien ataca primero tira un Random entre 0 y el ataque de su arma, y el que defiende intenta bloquear
con su objeto de defensa: Tira otro aleatorio entre 0
y la defensa del objeto, y la diferencia ataque-defensa son los puntos de daño que recibe, 
que se restan a la vida, hasta que uno de los dos
tenga vida cero.

Los objetos y armas se declaran en el main y se asignan al azar al principio de la partida.

Los objetos de ataque van a poder tener entre 5 y 20 
puntos

los objetos de defensa, igual pero en defensa.


Arma
	nombre
	puntosAtaque
	
Personaje
	vida
	arma
	proteccion
	nombre
	

Protección
	nombre
	puntosDefensa

Torneo
    participantes
    rondas
    
Ronda
 combates
	
Combate
	turno
	participante1
	participante2
	ganador
	

