% Copie y pegue aquí el código generado por el programa.
%Constantes
int: M =3; %Número de ciudades.
int: N =12; %tamaño del area cuadrada NxN;

%Posición academia
var int: x;
var int: y;

%Distancias de ciudades a la academias
var int: distancia_cali_academia = manhattan(1,2,x,y);
var int: distancia_tulua_academia = manhattan(3,3,x,y);
var int: distancia_pereira_academia = manhattan(2,1,x,y);

%Restricciones de Área
constraint x >= 0;
constraint y >= 0;
constraint x <=N;
constraint y <=N;

%Función Manhattan
function var int: manhattan(var int: x1, var int: y1,var int: x2, var int: y2)
= abs(x1 - x2) + abs(y1 - y2);

%z = suma de distancias
var int: z = distancia_cali_academia +
distancia_tulua_academia +
distancia_pereira_academia;

%%función objetivo, minimizar z.
solve minimize z;

%salida:
output["x = ", show(x), "y = ", show(y), ", Distancia mínima = ", show(z)];