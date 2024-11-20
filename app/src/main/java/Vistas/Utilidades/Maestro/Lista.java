package Vistas.Utilidades.Maestro;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.marin_murcia_francisco_app.R;
import java.util.ArrayList;
import java.util.List;
import Adaptadores.PersonajeAdapter;
import Modelos.Personaje;

public class Lista extends AppCompatActivity {

    public static final List<Personaje> listaPersonajes = new ArrayList<>();

    static {
        listaPersonajes.add(new Personaje(
                R.drawable.goku,
                "Goku",
                "Saiyan que salva la Tierra... y siempre tiene hambre.",
                R.drawable.gokuextra1,
                R.drawable.gokuextra2,
                "Son Goku es el protagonista principal del manga y anime de Dragon Ball creado por Akira Toriyama. Su nombre real y de nacimiento es Kakarotto y es uno de los pocos saiyanos que lograron sobrevivir a la destrucción total del Planeta Vegeta del Universo 7. Es el segundo hijo de Bardock y Gine, hermano menor de Raditz, nieto adoptivo de Son Gohan, esposo de Chi-Chi, padre de Son Gohan y Son Goten, a su vez también es el abuelo de Pan y ancestro de Son Goku Jr.\n" +
                        "\n" +
                        "Originalmente enviado a la Tierra como un infante volador con la misión de conquistarla. Sin embargo, el caer por un barranco le proporcionó un brutal golpe que si bien casi lo mata, este alteró su memoria y anuló todos los instintos violentos de su especie, lo que lo hizo crecer con un corazón puro y bondadoso, pero conservando todos los poderes de su raza."
        ));

        listaPersonajes.add(new Personaje(
                R.drawable.vegeta,
                "Vegeta",
                "Príncipe orgulloso y experto en perder contra Goku.",
                R.drawable.vegetaextra1,
                R.drawable.vegetaextra2,
                "Vegeta es el deuteragonista de Dragon Ball,hijo mayor del Rey Vegeta III, así como el príncipe más reciente de la familia real saiyana y uno de los pocos supervivientes tras el genocidio saiyano del planeta Vegeta del Universo 7, a manos de Freeza. Es el eterno rival de Son Goku, hermano mayor de Tarble, el esposo de Bulma, padre de Trunks y Bra y ancestro de Vegeta Jr.\n" +
                        "\n" +
                        "A pesar de que a inicios de Dragon Ball Z, Vegeta cumple un papel antagónico, poco después decide rebelarse ante el Ejército de Freeza, volviéndose un aliado clave para los Guerreros Z. Con el paso del tiempo llegaría a cambiar su manera de ser, optando por permanecer y vivir en la Tierra para luchar a su lado contra las inminentes adversidades que superar. Junto con Piccolo, él es de los antiguos enemigos de Goku que ha evolucionando al pasar de ser un villano y antihéroe, a finalmente un héroe a lo largo del transcurso de la historia, convirtiéndose así en el deuteragonista de la serie."
        ));

        listaPersonajes.add(new Personaje(
                R.drawable.gohan,
                "Gohan",
                "Hijo de Goku, amable... hasta que lo enfadan.",
                R.drawable.gohanextra1,
                R.drawable.gohanextra2,
                "Son Gohan , Son Gohanda en su tiempo en España, o simplemente Gohan en Hispanoamérica, es uno de los personajes principales de los arcos argumentales de Dragon Ball. Es un mestizo entre saiyano y humano terrícola. Es el primer hijo de Son Goku y Chi-Chi, hermano mayor de Son Goten, esposo de Videl y padre de Pan."
        ));

        listaPersonajes.add(new Personaje(
                R.drawable.piccolo,
                "Piccolo",
                "Mentor verde de Gohan y experto en meditar.",
                R.drawable.piccoloextra1,
                R.drawable.piccoloextra2,
                "Piccolo  o Piccolo Jr., es uno de los personajes principales que aparece en el manga y anime de Dragon Ball y sus correspondientes secuelas.\n" +
                        "\n" +
                        "Es un namekiano que surgió tras ser creado en los últimos momentos de vida de su padre, siendo su actual reencarnación. Aunque en un principio fue el archienemigo de Son Goku, con el paso del tiempo fue haciéndose menos malvado hasta finalmente convertirse en un ser bondadoso y miembro de los Guerreros Z. A través del tiempo, también comenzó a tomarle cariño a su discípulo Son Gohan, a quien veía como una especie de \"vástago\" y formando un lazo de amistad con este."
        ));

        listaPersonajes.add(new Personaje(
                R.drawable.trunks,
                "Trunks",
                "Viajero del tiempo y heredero del peinado de Bulma.",
                R.drawable.trunksextra1,
                R.drawable.trunksextra2,
                "Trunks es un mestizo entre humano terrícola y Saiyano nacido en la Tierra, e hijo de Bulma y Vegeta, el cual es introducido en el Arco de los Androides y Cell. Más tarde en su vida como joven, se termina convirtiendo en un luchador de artes marciales, el mejor amigo de Son Goten y en el hermano mayor de su hermana Bra."
        ));

        listaPersonajes.add(new Personaje(
                R.drawable.bulma,
                "Bulma",
                "Genio inventora y dueña de la paciencia infinita (por Goku).",
                R.drawable.bulmaextra1,
                R.drawable.bulmaextra2,
                "Bulma , también conocida como la científica genio Dra. Bulma es la protagonista femenina de la serie manga Dragon Ball y sus adaptaciones al anime. Es hija del Dr. Brief y su esposa Panchy, hermana menor de Tights y una gran amiga de Son Goku con quien inicia la búsqueda de las Esferas del Dragón. En Dragon Ball Z tuvo a Trunks, primogénito de quien sería su esposo Vegeta, a su hija Bra y su hijo adulto del tiempo alterno Trunks del Futuro Alternativo.\n" +
                        "\n" +
                        "Bulma es el personaje femenino más importante de la serie. Aparte de Goku, Bulma es el personaje de mayor duración única en toda la serie, que se introdujo en el primer capítulo y episodio de Dragon Ball, y mantiene un papel destacado hasta el último capítulo del manga, en Dragon Ball Super y el episodio final de Dragon Ball GT."
        ));
        listaPersonajes.add(new Personaje(
                R.drawable.goten,
                "Goten",
                "Pequeño Saiyan travieso y copia de Goku.",
                R.drawable.gotenextra1,
                R.drawable.gotenextra2,
                "Son Goten es el segundo hijo de Chi-Chi y Son Goku, y hermano menor de Son Gohan, que nació al poco tiempo de la segunda muerte de su padre."
        ));

        listaPersonajes.add(new Personaje(
                R.drawable.gotenks,
                "Gotenks",
                "Fusión alocada de Goten y Trunks, mucho ego.",
                R.drawable.gotenksextra1,
                R.drawable.gotenksextra2,
                "Gotenks también conocido inicialmente como Gotrunk en el doblaje al español de España, es el resultado de la Danza de la Fusión llevada a cabo correctamente por Goten y Trunks.\n"+
                        "\n"+
                        "Parece que Gotenks solo tiene los peores rasgos de la personalidad de Goten y Trunks. Es egoísta, grosero, presumido, confía demasiado en sus habilidades y enfada a Piccolo con sus payasadas. Sin embargo, los increíbles poderes de Gotenks compensan su mala actitud. En su primera aparición, Gotenks se apresuró a desafiar inmediatamente a Majin-Boo, recibiendo una tremenda paliza."
        ));

        listaPersonajes.add(new Personaje(
                R.drawable.krillin,
                "Krilin",
                "Experto en recibir golpes... y en revivir.",
                R.drawable.krillinextra1,
                R.drawable.krillinextra2,
                "Krilin es un personaje del manga y anime de Dragon Ball. Es uno de los principales discípulos del Maestro Tortuga, Guerrero Z, y el mejor amigo de Son Goku. Es junto a Bulma uno de los personajes de apoyo principales de Dragon Ball. Aparece en Dragon Ball GT como personaje secundario. A partir del Arco del Monstruo Boo, se retira de las artes marciales, optando por formar una familia, como el esposo de la Androide Número 18 y el padre de Marron."
        ));

        listaPersonajes.add(new Personaje(
                R.drawable.androide18,
                "Androide 18",
                "Androide letal y mamá de familia.",
                R.drawable.a18extra1,
                R.drawable.a18extra2,
                "Androide Número 18 conocida como Lazuli cuando era joven, es la hermana melliza del Androide Número 17 y una \"androide\" creada a partir de una base humana por el Dr. Gero con el único fin de destruir a Goku.\n" +
                        "\n" +
                        "Esta androide se une posteriormente a los Guerreros Z y más tarde termina siendo la esposa de Krilin y la madre de Marron. A pesar de no participar en las batallas contra Majin Boo, luchó en el Torneo de la Fuerza de Dragon Ball Super despues lucho junto con el Androide Número 17 contra Moro, lucho contra Cell Max en Dragon Ball Super: Superhéroe junto a Piccolo Anaranjado, Son Gohan, Krilin, Son Goten, Trunks, Gamma Número 1 y Gamma Número 2 y tambien contra Super Número 17 en Dragon Ball GT con ayuda de Goku."
        ));

        listaPersonajes.add(new Personaje(
                R.drawable.maestroroshi,
                "Maestro Roshi",
                "Viejo maestro pervertido e inmortal.",
                R.drawable.roshiextra1,
                R.drawable.roshiextra2,
                "Muten Roshi , quien se da a conocer como el Ermitaño Tortuga , fue en su momento el terrícola más fuerte de la Tierra, y mucha gente lo recuerda como el «Dios de las Artes Marciales», pero antes de poder ostentar dicho título tuvo que trabajar y estudiar las artes marciales con su maestro Mutaito y su eterno rival Ermitaño Grulla.\n" +
                        "\n" +
                        "Es el maestro y fundador del Estilo Tortuga , siendo el primer maestro tanto de Son Goku como de Krilin."
        ));

        listaPersonajes.add(new Personaje(
                R.drawable.tenshinhan,
                "Tenshinhan",
                "Un tipo serio con tres ojos.",
                R.drawable.tenshinhanextra1,
                R.drawable.tenshinhanextra2,
                "Ten Shinhan es un personaje que aparece en el manga y en el anime de Dragon Ball.\n" +
                        "\n" +
                        "Es un luchador terrícola humano de artes marciales descendiente de un clan alienígena, que tras realizar un largo entrenamiento mental, obtuvo un tercer ojo. Es considerado uno de los individuos más poderosos provenientes de la Tierra dentro del universo de Dragon Ball."
        ));

        listaPersonajes.add(new Personaje(
                R.drawable.chaoz,
                "Chaoz",
                "Pequeño, blanco y explosivo.",
                R.drawable.chaozextra1,
                R.drawable.chaozextra2,
                "Chaoz es un joven guerrero que siempre acompaña a Tenshinhan. " +
                        "Aunque es más pequeño que los demás, su valentía y determinación son enormes.Hijo de militares, junto con Ten Shinhan fueron alumnos en la Escuela de la Grulla de Tsuru Sen'nin y de Tao Pai Pai."
        ));

        listaPersonajes.add(new Personaje(
                R.drawable.frezzer,
                "Freezer",
                "Emperador galáctico con odio eterno a Goku.",
                R.drawable.freezerextra1,
                R.drawable.freezerextra2,
                "Freezer es un alienígena mutante, brutal dictador y líder del Imperio Galáctico del Universo 7 con el apoyo estratégico en secreto de su padre Cold. En las películas también lidera este imperio su hermano mayor Coola. Además de ser considerado como la contraparte de Frost del Universo 6.\n" +
                        "\n" +
                        "El tirano emperador es el responsable de la muerte de Bardock y Gine, los padres de Son Goku, del Rey Vegeta, así como de la mayor parte de su especie, los saiyanos del Planeta Vegeta, desembocando en una limpieza étnica conocida popularmente como el Genocidio saiyano.\n" +
                        "\n" +
                        "Aparece como el antagonista principal del Arco de Namek y Freezer, como un antagonista secundario del Arco de los Androides y Cell de Dragon Ball Z, para volver resucitado como antagonista principal en el Arco de Freeza Dorado (así como su versión de película Dragon Ball Z: La resurrección de «F»), regresando como compañero/aliado condicional de los Guerreros Z y Goku bajo el Equipo del Universo 7 en la Arco de la Supervivencia Universal de Dragon Ball Super, y estando en el anime spin-off Dragon Ball GT como un antagonista secundario en la Arco del Androide Definitivo. Es por todo ello y mucho más, por lo cual es considerado como el villano insignia de la franquicia Dragon Ball, el archienemigo de Goku y el peor rival de su antiguo aliado, el príncipe saiyano, Vegeta."
        ));

        listaPersonajes.add(new Personaje(
                R.drawable.celula,
                "Célula",
                "Insecto verde con complejo de perfección.",
                R.drawable.cellextra1,
                R.drawable.cellextra2,
                "Cell, conocido como Célula en España (Cell, a partir de DB Super y ZKai), es un bioandroide creado por la computadora del Dr. Gero, quien vino del futuro de la línea 3 con la intención de vengarse de Goku por haber acabado con el Ejército del Listón Rojo, y con ello el sueño de todo villano: dominar el mundo. Es el antagonista principal del Arco de los Androides y Cell.\n" +
                        "\n" +
                        "Está fabricado a partir de células de Goku, Piccolo, Vegeta, Freeza y su padre el Gran Rey Cold. Una minicomputadora en forma de insecto registró los movimientos y técnicas de estos luchadores, haciendo que Cell sepa usar todos sus ataques, y por ende, predecir la mayoría de sus movimientos. Cell puede absorber la energía vital de todo ser viviente con un aguijón al final de la cola, y para alcanzar la perfección de su cuerpo debe absorber a los androides Nº17 y Nº18. Para cumplir su objetivo, mató a Trunks y robó su Máquina del tiempo para viajar al pasado.\n" +
                        "\n" +
                        "Ya en el pasado, choca contra las versiones de Son Goku y sus compañeros en un intento por completar su desarrollo al absorber a los Androides 17 y número 18 de esta línea temporal, objetivo que finalmente consigue. Por diversión crea un \"torneo\" llamado los Juegos de Cell buscando simplemente a un oponente que pudiera derrotarlo bajo la amenaza de asesinar a todos los habitantes de la Tierra lo que desata un brutal enfrentamiento contra Son Goku y sus amigos, que termina costando la vida del saiyano. Al regresar de la explosión, donde intervino Son Goku, explica que usó la regeneración de Piccolo, además gracias a su Zenkai y considerando ciertas habilidades retorna como Supersaiyano 2 junto con la teletransportación. Sin embargo, acaba siendo eliminado por su hijo, Son Gohan el cual se ve forzado a superar sus propios límites alcanzando un poder inimaginable."
        ));

        listaPersonajes.add(new Personaje(
                R.drawable.boo,
                "Majin Boo",
                "Destruye cosas y ama el chocolate.",
                R.drawable.booextra1,
                R.drawable.booextra2,
                "Majin Bū (conocido en España como Bubú) es una criatura mágica surgida espontáneamente a partir de la maldad del universo, desde la creación del mismo universo 7 luego fue controlada por Bibidi . Con el objetivo de acabar con los dioses.\n" +
                        "\n" +
                        "Buu, era controlado por Bibidi. Durante su creación, los Supremo Kaiō Shin intervinieron, pero en la batalla Buu mata a los Kaiō Shin del Norte y el Kaiō Shin del Oeste. Durante su lucha contra el Kaiō Shin del Sur, él lo absorbe y se convierte en Ultra Buu; cuando Ultra Buu está apunto de Matar al Kaiō Shin del Este, Dai Kaiō Shin interviene y es absorbido por Buu, transformándose definitivamente en Majin Buu."
        ));

      
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        RecyclerView recyclerView = findViewById(R.id.recyclerView_personajes);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        PersonajeAdapter adapter = new PersonajeAdapter(listaPersonajes);
        recyclerView.setAdapter(adapter);
    }
}
