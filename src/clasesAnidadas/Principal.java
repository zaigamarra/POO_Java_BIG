package clasesAnidadas;

/**
 * Clases anidadas: es agrupar clases que pertenecen juntas,
 * lo que hace que su código sea más legible y fácil de mantener.
 */
class principal {

    public static void main(String[] args) {

        //------Ejemplo 1
        //clase_externa obj_externo = new clase_externa();
        //clase_externa.clase_interna obj_interno = obj_externo.new clase_interna();
        //System.out.println(obj_interno.y + obj_externo.x);

        //------Ejemplo 2
        //clase_externa.clase_interna obj_interno = new clase_externa.clase_interna();
        //System.out.println(obj_interno.y);

        //-------Ejemplo 3
        clase_externa obj_externo = new clase_externa();
        clase_externa.clase_interna obj_interno = obj_externo.new clase_interna();
        System.out.println(obj_interno.obj_interno_metodo());

    }

}
