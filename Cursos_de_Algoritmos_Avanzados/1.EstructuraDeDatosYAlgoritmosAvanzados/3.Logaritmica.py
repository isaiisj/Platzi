def busqueda_binaria(lista, target):
    apuntador_izquierdo = 0
    apuntador_derecho = len(lista) - 1 
    
    while apuntador_izquierdo <= apuntador_derecho:
        mitad = (apuntador_izquierdo+apuntador_derecho) // 2
        if lista[mitad] == target:
            return mitad
        elif lista[mitad] < target:
            apuntador_izquierdo = mitad + 1
        else: 
            apuntador_derecho = mitad - 1
    return -1
