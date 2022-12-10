package Qtwo1920;

import java.util.List;

interface SerializationHandler<E> {
	
	public void serialise(List<E> list);
	public List<E> deserialise();

}
