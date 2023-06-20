# proyecto
proyecto para la clase 
En su labor como programador de software ha sido elegido para el desarrollo de una aplicación que necesita un panadero de una panadería famosa, que desea calcular el promedio de ventas de la semana 7(días) en esta panadería venden 3 tipos de pan diferentes. Como información básica se quiere incluir los nombres de cada pan las ventas por separado de cada pan ala semana
# Historia de usuario
![image](https://github.com/darknaran/proyecto/assets/112526473/0452be5e-9da5-42bc-b2a7-fdd6bd1b6f93)
# Caso de uso
![image](https://github.com/darknaran/proyecto/assets/112526473/47d94ae7-5e60-4a05-866e-2fc44e5dbc52)
#Diagrama de flujo

![image](https://github.com/darknaran/proyecto/assets/112526473/24c0f205-1b3c-46ef-aa50-5525bc4483d4)
![image](https://github.com/darknaran/proyecto/assets/112526473/b1545c60-6b21-4813-ab4d-c4498ca64a41)

# pseudocódigo

	  Algoritmo panaderia_joselito
		Escribir  "Ingrese el nombre de los tres tipos de pan:"
		leer nombre1;
		leer nombre2;
		leer nombre3;
		Escribir "ingrese el valor de cada tipo de pan"
		leer valor1;
		leer valor2;
		leer valor3;
		Escribir "digite los panes vendidos el dia lunes de cada tipo"
		leer cantidad1;
		leer cantidad2;
		leer cantidad3;
		Escribir "digite los panes vendidos el dia martes de cada tipo"
		leer cantidad4;
		leer cantidad5;
		leer cantidad6;
		Escribir "digite los panes vendidos el dia miercoles de cada tipo"
		leer cantidad7;
		leer cantidad8;
		leer cantidad9;
		Escribir "digite los panes vendidos el dia jueves de cada tipo"
		leer cantidad10;
		leer cantidad11;
		leer cantidad12;
		Escribir "digite los panes vendidos el dia viernes de cada tipo"
		leer cantidad13;
		leer cantidad14;
		leer cantidad15;
		Escribir "digite los panes vendidos el dia sabado de cada tipo"
		leer cantidad16;
		leer cantidad17;
		leer cantidad18;
		Escribir "digite los panes vendidos el dia domingo de cada tipo"
		leer cantidad19;
		leer cantidad20;
		leer cantidad21;
		promedio1 = (cantidad1+cantidad4+cantidad7+cantidad10+cantidad13+cantidad16+cantidad19)/7
		Escribir "el promedio de panes vendidos durante la semana de tipo:" nombre1 " es:"
		Escribir promedio1;
		promedioprecio1 =(cantidad1+cantidad4+cantidad7+cantidad10+cantidad13+cantidad16+cantidad19)*(valor1)
		Escribir " y las ganacias durante la semana de los panes de tipo:" nombre1 " es:" 
		Escribir promedioprecio1;
		promedio2 = (cantidad2+cantidad5+cantidad8+cantidad11+cantidad14+cantidad17+cantidad20)/7
		Escribir "el promedio de panes vendidos durante la semana de tipo:" nombre2 " es:"
		Escribir promedio2;
		promedioprecio2 =(cantidad2+cantidad5+cantidad8+cantidad11+cantidad14+cantidad17+cantidad20)*(valor2)
		Escribir " y las ganacias durante la semana de los panes de tipo:" nombre2 " es:" 
		Escribir promedioprecio2;
		promedio3 = (cantidad3+cantidad6+cantidad9+cantidad12+cantidad15+cantidad18+cantidad21)/7
		Escribir "el promedio de panes vendidos durante la semana de tipo:" nombre3 " es:"
		Escribir promedio3;
		promedioprecio3 =(cantidad3+cantidad6+cantidad9+cantidad12+cantidad15+cantidad18+cantidad21)*(valor3)
		Escribir " y las ganacias durante la semana de los panes de tipo:" nombre3 " es:" 
		Escribir promedioprecio3;
		promediogeneral =(promedio1+promedio2+promedio3)/3
		ventastotales =(promedioprecio1+promedioprecio2+promedioprecio3)
		Escribir"el promedio general de cantidad de panes vendidos es:	" prmediogeneral;
		Escribir "la ganancia general duralte la semana fue	;	" ventastotales;
	FinAlgoritmo
