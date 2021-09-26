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

        ArrayList<Categoria> ac = new ArrayList<>();
        ac.add( new Categoria(
                c -> {
                    c.setId("MLA5725");
                    c.setName("Accesorios para Vehículos");
                    c.setColour("#FF5733");

                }
        ));
        ac.add( new Categoria(
                c -> {
                    c.setId("MLA1512");
                    c.setName("Agro");
                    c.setColour("#FF8633");

                }
        ));
        ac.add( new Categoria(
                c -> {
                    c.setId("MLA1403");
                    c.setName("Alimentos y Bebidas");
                    c.setColour("#FFA333");

                }
        ));
        ac.add( new Categoria(
                c -> {
                    c.setId("MLA1071");
                    c.setName("Animales y Mascotas");
                    c.setColour("#FFC733");

                }
        ));
        ac.add( new Categoria(
                c -> {
                    c.setId("MLA1367");
                    c.setName("Antigüedades y Colecciones");
                    c.setColour("#FFA133");

                }
        ));
        ac.add( new Categoria(
                c -> {
                    c.setId("MLA1368");
                    c.setName("Arte, Librería y Mercería");
                    c.setColour("#FFAA33");

                }
        ));
        ac.add( new Categoria(
                c -> {
                    c.setId("MLA1743");
                    c.setName("Autos, Motos y Otros");
                    c.setColour("#FFB233");

                }
        ));
        ac.add( new Categoria(
                c -> {
                    c.setId("MLA1384");
                    c.setName("Bebés");
                    c.setColour("#FFCC33");

                }
        ));
        ac.add( new Categoria(
                c -> {
                    c.setId("MLA1246");
                    c.setName("Belleza y Cuidado Personal");
                    c.setColour("#FFEE33");

                }
        ));
        ac.add( new Categoria(
                c -> {
                    c.setId("MLA1039");
                    c.setName("Cámaras y Accesorios");
                    c.setColour("#FF1133");

                }
        ));
        ac.add( new Categoria(
                c -> {
                    c.setId("MLA1051");
                    c.setName("Celulares y Teléfonos");
                    c.setColour("#FF6633");

                }
        ));
        ac.add( new Categoria(
                c -> {
                    c.setId("MLA1648");
                    c.setName("Computación");
                    c.setColour("#FFFF33");

                }
        ));
        ac.add( new Categoria(
                c -> {
                    c.setId("MLA1144");
                    c.setName("Consolas y Videojuegos");
                    c.setColour("#FFF133");

                }
        ));
        ac.add( new Categoria(
                c -> {
                    c.setId("MLA1500");
                    c.setName("Construcción");
                    c.setColour("#FFE133");

                }
        ));

        ac.add( new Categoria(
                c -> {
                    c.setId("MLA1276");
                    c.setName("Deportes y Fitness");
                    c.setColour("#3380FF");

                }
        ));
        ac.add( new Categoria(
                c -> {
                    c.setId("MLA5726");
                    c.setName("Electrodomésticos y Aires Ac.");
                    c.setColour("#3345FF");

                }
        ));
        ac.add( new Categoria(
                c -> {
                    c.setId("MLA1000");
                    c.setName("Electrónica, Audio y Video");
                    c.setColour("#4B33FF");

                }
        ));
        ac.add( new Categoria(
                c -> {
                    c.setId("MLA2547");
                    c.setName("Entradas para Eventos");
                    c.setColour("#6E33FF");

                }
        ));
        ac.add( new Categoria(
                c -> {
                    c.setId("MLA407134");
                    c.setName("Herramientas");
                    c.setColour("#9233FF");

                }
        ));
        ac.add( new Categoria(
                c -> {
                    c.setId("MLA1574");
                    c.setName("Hogar, Muebles y Jardín");
                    c.setColour("#C133FF");

                }
        ));
        ac.add( new Categoria(
                c -> {
                    c.setId("MLA1499");
                    c.setName("Industrias y Oficinas");
                    c.setColour("#EA33FF");

                }
        ));
        ac.add( new Categoria(
                c -> {
                    c.setId("MLA1459");
                    c.setName("Inmuebles");
                    c.setColour("#FF33EA");

                }
        ));
        ac.add( new Categoria(
                c -> {
                    c.setId("MLA1182");
                    c.setName("Instrumentos Musicales");
                    c.setColour("#FF33B5");

                }
        ));
        ac.add( new Categoria(
                c -> {
                    c.setId("MLA3937");
                    c.setName("Joyas y Relojes");
                    c.setColour("#FF338C");

                }
        ));
        ac.add( new Categoria(
                c -> {
                    c.setId("MLA1132");
                    c.setName("Juegos y Juguetes");
                    c.setColour("#FF3368");

                }
        ));
        ac.add( new Categoria(
                c -> {
                    c.setId("MLA3025");
                    c.setName("Libros, Revistas y Comics");
                    c.setColour("#FF334B");

                }
        ));
        ac.add( new Categoria(
                c -> {
                    c.setId("MLA1168");
                    c.setName("Música, Películas y Series");
                    c.setColour("#FF3333");

                }
        ));
        ac.add( new Categoria(
                c -> {
                    c.setId("MLA1430");
                    c.setName("Ropa y Accesorios");
                    c.setColour("#6EFF33");

                }
        ));
        ac.add( new Categoria(
                c -> {
                    c.setId("MLA409431");
                    c.setName("Salud y Equipamiento Médico");
                    c.setColour("#3FFF33");

                }
        ));
        ac.add( new Categoria(
                c -> {
                    c.setId("MLA1540");
                    c.setName("Servicios");
                    c.setColour("#33FF62");

                }
        ));
        ac.add( new Categoria(
                c -> {
                    c.setId("MLA9304");
                    c.setName("Souvenirs, Cotillón y Fiestas");
                    c.setColour("#33FF9D");

                }
        ));
        ac.add( new Categoria(
                c -> {
                    c.setId("MLA1953");
                    c.setName("Otras categorías");
                    c.setColour("#33FFCD");

                }
        ));


        return ac;
    }

}
