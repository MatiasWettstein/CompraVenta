package com.dam.compraventa.model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Categoria {
    private String id;
    private String colour;
    private String name;
    private Boolean myList;

    public Categoria(String id, String colour, String name) {
        this.id = id;
        this.colour = colour;
        this.name = name;
    }

    public Categoria(Consumer<Categoria> c){
        c.accept(this);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getMyList() {
        return myList;
    }

    public void setMyList(Boolean myList) {
        this.myList = myList;
    }


    public static List<Categoria> ejemplos(){

        ArrayList<Categoria> as = new ArrayList<>();
        as.add( new Categoria(
                c -> {
                    c.setId("MLA5725");
                    c.setName("Accesorios para Vehículos");
                    c.setColour("");

                }
        ));
        as.add( new Categoria(
                c -> {
                    c.setId("MLA1512");
                    c.setName("Agro");
                    c.setColour("");

                }
        ));
        as.add( new Categoria(
                c -> {
                    c.setId("MLA1403");
                    c.setName("Alimentos y Bebidas");
                    c.setColour("");

                }
        ));
        as.add( new Categoria(
                c -> {
                    c.setId("MLA1071");
                    c.setName("Animales y Mascotas");
                    c.setColour("");

                }
        ));
        as.add( new Categoria(
                c -> {
                    c.setId("MLA1367");
                    c.setName("Antigüedades y Colecciones");
                    c.setColour("");

                }
        ));
        as.add( new Categoria(
                c -> {
                    c.setId("MLA1368");
                    c.setName("Arte, Librería y Mercería");
                    c.setColour("");

                }
        ));
        as.add( new Categoria(
                c -> {
                    c.setId("MLA1743");
                    c.setName("Autos, Motos y Otros");
                    c.setColour("");

                }
        ));
        as.add( new Categoria(
                c -> {
                    c.setId("MLA1384");
                    c.setName("Bebés");
                    c.setColour("");

                }
        ));
        as.add( new Categoria(
                c -> {
                    c.setId("MLA1246");
                    c.setName("Belleza y Cuidado Personal");
                    c.setColour("");

                }
        ));
        as.add( new Categoria(
                c -> {
                    c.setId("MLA1039");
                    c.setName("Cámaras y Accesorios");
                    c.setColour("");

                }
        ));
        as.add( new Categoria(
                c -> {
                    c.setId("MLA1051");
                    c.setName("Celulares y Teléfonos");
                    c.setColour("");

                }
        ));
        as.add( new Categoria(
                c -> {
                    c.setId("MLA1648");
                    c.setName("Computación");
                    c.setColour("");

                }
        ));
        as.add( new Categoria(
                c -> {
                    c.setId("MLA1144");
                    c.setName("Consolas y Videojuegos");
                    c.setColour("");

                }
        ));
        as.add( new Categoria(
                c -> {
                    c.setId("MLA1500");
                    c.setName("Construcción");
                    c.setColour("");

                }
        ));

        as.add( new Categoria(
                c -> {
                    c.setId("MLA1276");
                    c.setName("Deportes y Fitness");
                    c.setColour("");

                }
        ));
        as.add( new Categoria(
                c -> {
                    c.setId("MLA5726");
                    c.setName("Electrodomésticos y Aires Ac.");
                    c.setColour("");

                }
        ));
        as.add( new Categoria(
                c -> {
                    c.setId("MLA1000");
                    c.setName("Electrónica, Audio y Video");
                    c.setColour("");

                }
        ));
        as.add( new Categoria(
                c -> {
                    c.setId("MLA2547");
                    c.setName("Entradas para Eventos");
                    c.setColour("");

                }
        ));
        as.add( new Categoria(
                c -> {
                    c.setId("MLA407134");
                    c.setName("Herramientas");
                    c.setColour("");

                }
        ));
        as.add( new Categoria(
                c -> {
                    c.setId("MLA1574");
                    c.setName("Hogar, Muebles y Jardín");
                    c.setColour("");

                }
        ));
        as.add( new Categoria(
                c -> {
                    c.setId("MLA1499");
                    c.setName("Industrias y Oficinas");
                    c.setColour("");

                }
        ));
        as.add( new Categoria(
                c -> {
                    c.setId("MLA1459");
                    c.setName("Inmuebles");
                    c.setColour("");

                }
        ));
        as.add( new Categoria(
                c -> {
                    c.setId("MLA1182");
                    c.setName("Instrumentos Musicales");
                    c.setColour("");

                }
        ));
        as.add( new Categoria(
                c -> {
                    c.setId("MLA3937");
                    c.setName("Joyas y Relojes");
                    c.setColour("");

                }
        ));
        as.add( new Categoria(
                c -> {
                    c.setId("MLA1132");
                    c.setName("Juegos y Juguetes");
                    c.setColour("");

                }
        ));
        as.add( new Categoria(
                c -> {
                    c.setId("MLA3025");
                    c.setName("Libros, Revistas y Comics");
                    c.setColour("");

                }
        ));
        as.add( new Categoria(
                c -> {
                    c.setId("MLA1168");
                    c.setName("Música, Películas y Series");
                    c.setColour("");

                }
        ));
        as.add( new Categoria(
                c -> {
                    c.setId("MLA1430");
                    c.setName("Ropa y Accesorios");
                    c.setColour("");

                }
        ));
        as.add( new Categoria(
                c -> {
                    c.setId("MLA409431");
                    c.setName("Salud y Equipamiento Médico");
                    c.setColour("");

                }
        ));
        as.add( new Categoria(
                c -> {
                    c.setId("MLA1540");
                    c.setName("Servicios");
                    c.setColour("");

                }
        ));
        as.add( new Categoria(
                c -> {
                    c.setId("MLA9304");
                    c.setName("Souvenirs, Cotillón y Fiestas");
                    c.setColour("");

                }
        ));
        as.add( new Categoria(
                c -> {
                    c.setId("MLA1953");
                    c.setName("Otras categorías");
                    c.setColour("");

                }
        ));


        return as;
    }

}
