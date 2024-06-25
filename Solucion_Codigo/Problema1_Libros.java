import java.util.List;

public class NewClass {
    class CapituloLibro {
        public List<Seccion> secciones;

        public CapituloLibro(List<Seccion> secciones) {
            this.secciones = secciones;
        }

        public List<Seccion> getSecciones() {
            return secciones;
        }

        public void setSecciones(List<Seccion> secciones) {
            this.secciones = secciones;
        }
    }

    class Seccion {
        public List<ComponenteSeccion> componentes;

        public Seccion(List<ComponenteSeccion> componentes) {
            this.componentes = componentes;
        }

        public List<ComponenteSeccion> getComponentes() {
            return componentes;
        }

        public void setComponentes(List<ComponenteSeccion> componentes) {
            this.componentes = componentes;
        }
    }

    class ComponenteSeccion {
    }

    class Parrafo extends ComponenteSeccion {
        public List<Sentencia> sentencias;

        public Parrafo(List<Sentencia> sentencias) {
            this.sentencias = sentencias;
        }

        public List<Sentencia> getSentencias() {
            return sentencias;
        }

        public void setSentencias(List<Sentencia> sentencias) {
            this.sentencias = sentencias;
        }
    }

    class Figura extends ComponenteSeccion {
    }

    class Sentencia {
        public List<Palabra> palabras;

        public Sentencia(List<Palabra> palabras) {
            this.palabras = palabras;
        }

        public List<Palabra> getPalabras() {
            return palabras;
        }

        public void setPalabras(List<Palabra> palabras) {
            this.palabras = palabras;
        }
    }

    class Palabra {
        public String texto;

        public Palabra(String texto) {
            this.texto = texto;
        }

        public String getTexto() {
            return texto;
        }

        public void setTexto(String texto) {
            this.texto = texto;
        }
    }
}
