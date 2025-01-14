class clients:
	def __init__(self, name, id, credit, address):
		self.name = name
		self.id = id
		self.credit = credit
		self.address = address

cliente = clients("Sebastian", "0000004", "1000000", "Carabayllo, parque 2 ciudad Lima")

def muestra_clientes():
	print("Nombre: ", cliente.name)
	print("Id: ", cliente.id)
	print("Crédito: ", cliente.credit)
	print("Dirección: ", cliente.address)


if __name__ == '__main__':
	muestra_clientes()
