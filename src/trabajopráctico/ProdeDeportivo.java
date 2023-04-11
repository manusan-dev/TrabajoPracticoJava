package trabajopráctico;


		import java.io.BufferedReader;
		import java.io.FileReader;
		import java.io.IOException;

		public class ProdeDeportivo {
		    public static void main(String[] args) {
//		        if (args.length != 2) { // para asegurarse de que sean 2 los archivos recibidos
//		            System.err.println("Debe proporcionar dos archivos");
//		            return;
//		        }
		        
		        Partido partidos = null;
		        Pronostico pronostico = null;
		        

		        // Obtener las rutas de los archivos de partidos y resultados
		        String archivoPronostico = "C:\\Users\\Manuel\\Documents\\NetBeansProjects\\TrabajoPráctico\\src\\trabajopráctico\\pronostico.csv";
		        String archivoResultados = "C:\\Users\\Manuel\\Documents\\NetBeansProjects\\TrabajoPráctico\\src\\trabajopráctico\\resultados.csv";

		       
            try (BufferedReader lector = new BufferedReader(new FileReader(archivoResultados))) {
                String linea;
                int i = 0;
                lector.readLine();
                while ((linea = lector.readLine()) != null && i < 2) {
                    String[] campos = linea.split(",");
                    Equipo equipoLocal = new Equipo(campos[1], "equipo local");
                    Equipo equipoVisitante = new Equipo(campos[4], "equipo visitante");
                    int golesEquipo1 = Integer.parseInt(campos[2]);
                    int golesEquipo2 = Integer.parseInt(campos[3]);
                    partidos = new Partido(equipoLocal, equipoVisitante, golesEquipo1, golesEquipo2);
                    System.out.println("nombre equipo local: " + partidos.getEquipoLocal().getNombre());

                    System.out.println("equipo local visitante: " + partidos.getEquipoVisitante().getNombre());

                    System.out.println("goles equipo local: " + partidos.getGolesEquipo1());

                    System.out.println("goles equipo visitante: " + partidos.getGolesEquipo2());

                }
            } catch (IOException e) {
                System.err.println("Error al leer archivo partidos: " + e.getMessage());
                return;
            }
            System.out.println("....................................");

            try (BufferedReader lector = new BufferedReader(new FileReader(archivoPronostico))) {
                String linea;
//		             int i = 0;
                lector.readLine();
                if ((linea = lector.readLine()) != null) {
                    String[] campos = linea.split(",");
                    int codigoPartido = Integer.parseInt(campos[0]);
                    Equipo equipo = new Equipo(campos[1], "equipo local");
                    int codigo = (Integer.parseInt(campos[2]));
                    pronostico = new Pronostico(codigoPartido, equipo, codigo);
                }
            } catch (IOException e) {
                System.err.println("Error al leer archivo partidos: " + e.getMessage());
                return;
            }
            System.out.println("Puntaje obtenido en esta ronda es de: " + pronostico.Puntos(partidos) + " puntos.");
        }
		}
		
		
		
		
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		   
		    
		    
		    
		    
		    
		    
		    
		    
		    
		   