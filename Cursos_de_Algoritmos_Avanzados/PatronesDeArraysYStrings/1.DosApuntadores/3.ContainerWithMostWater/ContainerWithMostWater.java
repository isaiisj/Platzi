public class Main {
  public int maxArea(int[] alturas){
    int izquierda = 0;
    int derecha = alturas.length - 1;
    int areaMaxima = 0;

    while ( izquierda < derecha ){
      int areaActual = (derecha - izquierda) * Math.min(alturas[izquierda], 
      alturas[derecha]);
      areaMaxima = Math.max( areaMaxima, areaActual );
      
      if( alturas[izquierda] < alturas[derecha] ){
        izquierda += 1;
      } else {
        derecha -= 1;
      }
      
    }
    
    return areaMaxima;
  }
  
}
