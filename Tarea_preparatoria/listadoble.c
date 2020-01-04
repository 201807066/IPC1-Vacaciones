//Brayan Andrés Cholotio Tum
//201807066

#include <stdio.h>
#include <conio.h>

//Estructura del nodo.
typedef struct nodo{
    int codigo, edad, telefono;
    char nombre;
	struct nodo* siguiente;
	struct nodo* atras;
}nodo;

nodo* primero = NULL;
nodo* ultimo = NULL;

//Llamada de los metodos
void insertarNodo();
void buscarNodo();
void modificarNodo();
void desplegarLista();

int main(){
	int opcionMenu = 0;

	do{
        system("cls");
        printf("Menu de Opciones\n\n");
        printf("1. Insertar registro\n");
        printf("2. Modificar registro\n");
        printf("3. Eliminar\n");
        printf("4. Mostrar\n");
        printf("5. Salir\n\n");
        printf("Opcion a escoger: ");
		printf("\n\n Escoja una Opcion: ");
		scanf("%d", &opcionMenu);

		switch(opcionMenu)
		{
			case 1:
                system("cls");
                printf("Ingresar Registro\n\n");
                insertarNodo();
                system("pause");
				break;
			case 2:
			    system("cls");
			    printf("\n\n Modificar Registro \n\n");
				modificarNodo();
				system("pause");
				break;

			case 3:
			    system("cls");
				printf("\n\n Eliminar Registro \n\n");
				printf("Metodo en proceso de codificacion...");
				system("pause");
				break;
			case 4:
			    system("cls");
				printf("\n\n Mostrar Registro\n\n");
				desplegarLista();
				system("pause");
				break;
			case 5:
			    system("cls");
				printf("\n\n Programa finalizado...");
				system("pause");
				break;

			default:
				printf("\n\n Opcion No Valida \n\n");
		}
	}while(opcionMenu != 5);
	return 0;
}
//Metodo para insertar los registros
void insertarNodo(){
	nodo* nuevo = (nodo*)malloc(sizeof(nodo));

    printf("Ingrese el codigo del usuario: ");
    scanf("%d", &nuevo->codigo);
    printf("\nIngrese la edad del usuario: ");
    scanf("%d", &nuevo->edad);
    printf("\nIngrese el numero de telefono del usuario: ");
    scanf("%d", &nuevo->telefono);
   // printf("\nIngrese el nombre del usuario: ");
    //scanf("%d", &nuevo->nombre);

	if(primero==NULL){
		primero = nuevo;
		primero->siguiente = NULL;
		primero->atras = NULL;
		ultimo = primero;
	}else{
		ultimo->siguiente = nuevo;
		nuevo->siguiente = NULL;
		nuevo->atras = ultimo;
		ultimo = nuevo;
	}

	printf("\n Datos ingresados con exito\n\n");
}

//Metodo para buscar por medio del codigo del usuario
void buscarNodo(){
	nodo* actual = (nodo*)malloc(sizeof(nodo));
	actual = primero;
	int nodoBuscado = 0, encontrado = 0;
	printf(" Ingrese el codigo del dato a Buscar: ");
	scanf("%d", &nodoBuscado);

	if(primero!=NULL){
		while(actual != NULL && encontrado != 1){

			if(actual->codigo == nodoBuscado){
				printf("\n El nodo con el dato ( %d ) Encontrado\n\n", nodoBuscado);
				encontrado = 1;
			}

			actual = actual->siguiente;
		}
		if(encontrado == 0){
			printf("\n Nodo no Encontrado\n\n");
		}
	}else{
		printf("\n La lista se encuentra vacia\n\n");
	}
}

//Metodo para modificar el registro del usuario, como primero paso se hace la busqueda
void modificarNodo(){
	nodo* actual = (nodo*)malloc(sizeof(nodo));
	actual = primero;
	int nodoBuscado = 0, encontrado = 0;
	printf(" Ingrese el codigo de registro a Buscar para Modificar: ");
	scanf("%d", &nodoBuscado);

	if(primero!=NULL){
		while(actual != NULL && encontrado != 1){

			if(actual->codigo == nodoBuscado){
				printf("\n El registro con el codigo ( %d ) Encontrado", nodoBuscado);
				printf("\nIngrese el nuevo codigo del usuario: ");
                scanf("%d", &actual->codigo);
                //printf("\nIngrese el nuevo nombre del usuario: ");
                //scanf("%d", &actual->nombre);
                printf("\nIngrese la nueva edad del usuario: ");
                scanf("%d", &actual->edad);
                printf("\nIngrese el nuevo numero de telefono del usuario: ");
                scanf("%d", &actual->telefono);
				printf("\n Nodo modificado con exito\n\n");
				encontrado = 1;
			}

			actual = actual->siguiente;
		}
		if(encontrado == 0){
			printf("\n Nodo no Encontrado\n\n");
		}
	}else{
		printf("\n La lista se encuentra vacia\n\n");
	}
}

//Metodo para mostrar los registros que contiene nustra lista
void desplegarLista(){
	nodo* actual = (nodo*)malloc(sizeof(nodo));
	actual = primero;
	if(primero!=NULL){
		while(actual != NULL){
            printf("El codigo ingresado es de: %d ", actual->codigo);
            printf("\nLa edad es de: %d ",actual->edad);
            printf("\nEl numero de telefono es de: %d ", actual->telefono);
            printf("\nEl nombre es: %d ", actual->nombre);
            printf("\n\n");
			actual = actual->siguiente;
		}
	}else{
		printf("\n La lista se encuentra vacia\n\n");
	}
}

//Función para eliminar un nodo de la lista
/*void EliminarNodo()
{
    nodo *acual = (nodo*)malloc(sizeof(nodo));
    actual = primero;
    int nodoBuscado = 0, encontrado = 0;

    printf("Ingrese el registro a eliminar: ");
    scanf("%d", &nodoBuscado);

    if(primero != NULL)
    {
    while(actual != NULL)
    {
        if(actual->codigo == codigo )
        {
            if( actual == *cabeza)
            {
                *cabeza = actual->siguiente;
                if( actual->siguiente != NULL)
                    actual->siguiente->anterior = NULL;
            }
            else if( actual->siguiente == NULL)
            {
                ant = actual->anterior;
                actual->anterior = NULL;
                ant->siguiente = NULL;
            }
            else
            {
                ant = actual->anterior;
                actual->anterior = NULL;
                sig = actual->siguiente;
                actual->siguiente = NULL;
                ant->siguiente = sig;
                sig->anterior = ant;
            }
            free(actual);
            return 1;
        }
        actual = actual->siguiente;
    }
    }
    return 0;
}
*/
