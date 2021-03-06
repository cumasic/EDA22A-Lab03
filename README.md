# EDA22A-Lab03
<table>
    <theader>
        <tr>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/epis.png?raw=true" alt="EPIS" style="width:50%; height:auto"/></td>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD NACIONAL DE SAN AGUSTIN</span><br />
                <span style="font-weight:bold;">FACULTAD DE INGENIERÍA DE PRODUCCIÓN Y SERVICIOS</span><br />
                <span style="font-weight:bold;">ESCUELA PROFESIONAL DE INGENIERÍA DE SISTEMAS</span>
            </th>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/abet.png?raw=true" alt="ABET" style="width:50%; height:auto"/></td>
        </tr>
    </theader>
    <tbody>
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>: Guía de Práctica de Laboratorio / Talleres / Centros de Simulación</td></tr>
        <tr><td><span style="font-weight:bold;">Aprobación</span>:  2022/03/01</td><td><span style="font-weight:bold;">Código</span>: GUIA-PRLD-001</td><td><span style="font-weight:bold;">Página</span>: 1</td></tr>
    </tbody>
</table>
</div>
<div align="center">
    <span style="font-weight:bold;"><h2>INFORME DE LABORATORIO</h2></span>
</div>


<table>
<theader>
    <tr><th colspan="6" style="width:50%; height:auto; text-align:center">INFORMACIÓN BÁSICA</th></tr>
</theader>
<tbody>
    <tr>
        <td>ASIGNATURA:</td><td colspan="5">Laboratorio de Estructura de Datos y Algoritmos</td>
    </tr>
    <tr>
        <td>TÍTULO DE LA PRÁCTICA:</td><td colspan="5">Pilas y Colas</td>
    </tr>
    <tr>
        <td>NÚMERO DE PRÁCTICA:</td><td>03</td><td>AÑO LECTIVO:</td><td>2022 A</td><td>NRO. SEMESTRE:</td><td>III</td>
    </tr>
    <tr>
        <td colspan="2">FECHA DE PRESENTACIÓN</td><td>5-Jun-2022</td><td colspan="2">HORA DE PRESENTACIÓN: </td><td>9 pm</td>
    </tr>
    <tr>
        <td colspan="3">INTEGRANTES:
        <ol>
        <li>Umasi Cariapaza, Carlos Daniel</li>
        </ol>
        </td>
        <td colspan="2"> NOTA:</td>
        <td>     </td>
    </tr>
    <tr>
        <td colspan="6">DOCENTE:<br>
        Mg. Richart Smith Escobedo Quispe
        </td>
    </tr>
</tdbody>
</table>

<table>
    <theader>
        <tr>
            <th style="text-align:center">SOLUCIÓN Y RESULTADOS</th>
        </tr>
    </theader>
    <tbody>
        <tr>
            <td>
            I. SOLUCIÓN DE EJERCICIOS/PROBLEMAS
            <ol>
                <li>Pilas Iguales<br>
                <p>Se utilizó la función equalStacks, y su código es:<br>
               <pre>
while(sum1!=sum2 || sum2!=sum3) {<
    mayor = Math.max(sum2, sum3);<
    mayor = Math.max(mayor, sum1);
    if(mayor==sum1) {
        sum1 = sum1-a[a.length-i];
        i++;
    }
    else if(mayor==sum2) {
        sum2 = sum2-b[b.length-j];
        j++;
    }
    else if(mayor==sum3) {
        sum3 = sum3-c[c.length-k];
        k++;
    }
}
return sum1;</pre>
                <p>Este bucle compara la suma total de cada pila y resta su último elemento dependiendo si es el mayor para ver si en algún momento todas las sumas son iguales de no ser así se restará hasta ser 0 y lo devolverá .<br>
                Ejemplo:<br>
                <img src="Imagenes/PilasIguales1.png"style="width:50%; height:auto"/><br>
                <img src="Imagenes/PilasIguales2.png"style="width:50%; height:auto"/><br>
                </li>
                <li>Pilas<br>
                <p>Para hacer pilas genéricas se utilizó una clase Node y se usaron las siguientes funciones de la interfaz Stack:<br>
                <pre>
void push(E x);
E pop() throws ExceptionIsEmpty;
E top() throws ExceptionIsEmpty;
int search(E x); 
boolean isEmpty();</pre>
                <p>Las cuales se completaron en la clase StackList, y para probar su funcionamiento se utilizó la clase TestStack<br>
                Ejemplo:<br>
                <img src="Imagenes/Pilas.png"style="width:25%; height:auto"/><br>
                </li>
                <li>Colas<br>
                <p>Para hacer pilas genéricas se utilizó una clase Node y se usaron las siguientes funciones de la interfaz Queue:<br>
                <pre>
void enqueue(E x);
E dequeue() throws ExceptionIsEmpty;
E front() throws ExceptionIsEmpty;
E back() throws ExceptionIsEmpty;
boolean isEmpty();</pre>
                <p>Las cuales se completaron en la clase QueueList, y para probar su funcionamiento se utilizó la clase TestQueue<br>
                Ejemplo:<br>
                <img src="Imagenes/Colas.png"style="width:25%; height:auto"/><br>
                </li>
            </ol>
            </td> 
        </tr>
        <tr>
            <td>
            II. SOLUCIÓN DEL CUESTIONARIO<br>
            <ul>
                <li><b>¿Qué similitudes hay entre una Lista Enlazada y una Pila?</b></li>
                <p>
                -Los 2 llaman a un siguiente nodo para usar sus funciones como en Lista(search) o en Pila(pop)<br>
                -Al insertar un nuevo elemento ambas pueden desplazar al anterior para colocar al nuevo<br>
                -Las posiciones no son fijas
                <li><b>¿En que casos seria favorable/desfavorable utilizar Pila/Cola?
                </b></li>
                <p>
                Pila sería favorable usarse cuando queremos saber los últimos datos de alguna lista.<br>
                Pila sería desfavorable usarse si es que queremos sacar datos de una parte específica ya que al solo poder sacar el tope se harían muchos pop y esto sería ineficiente.<br>
                Cola sería favorable usarse para que cada dato tenga un número determinado de posición y así poder llevar un orden a la hora de seleccionar.<br>
                Cola sería desfavorable cuando queramos sacar datos y no sabemos en cual orden irán pues no se sabrá y uno tiene cierta prioridad o cual no la tiene<br>
            </ul>
            </td>
        </tr>
        <tr>
            <td>
            III. CONCLUSIONES<br>
                <ul>
                    <li>Las pilas y las colas son como listas enlazadas solo que modificadas para realizar tareas específicas las cuales son necesarias en la programación de datos.
</li>
                    <li>Las pilas y las colas tienen puntos fuertes como débiles y cada una sirve para realizar una función específica, de lo contrario serían ineficaces.</li>
                </ul>
            </td>
        </tr>
    </tbody>
</table>

<table>
    <theader>
        <tr>
            <th style="text-align:center">RETROALIMENTACIÓN GENERAL</th>
        </tr>
    </theader>
    <tbody>
        <tr>
            <td>
            </td>
        </tr>
    </tbody>
</table>

<table>
    <theader>
        <tr>
            <th style="text-align:center">REFERENCIAS Y BIBLIOGRAFÍA</th>
        </tr>
    </theader>
    <tbody>
        <tr>
            <td>
                -Escobedo, R., 2022. pw2/labs/lab03 at main · rescobedoq/pw2. [online] GitHub. Available at: https://github.com/rescobedoq/pw2/tree/main/labs/lab03.<br>
                -https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html<br>
                -https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html<br> 
            </td>
        </tr>
    </tbody>
</table>
