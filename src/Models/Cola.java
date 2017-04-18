package Models;

import java.util.Arrays;

public class Cola<T> {
	
	private T[] array;
	
	// Constructor
	@SuppressWarnings("unchecked")
	public Cola(){
		this.array = (T[]) new Object[0];
	}
	
	
	
	// Devuelve el tamaño del array
	public int size(){
		return this.array.length;
	}
	
	// Devuelve booleano del estado del array, true = vacio, de lo contrario false.
	public boolean isEmpty(){
		return (this.array.length == 0) ? true : false;
	}
	
	// Devuelve booleano true si el elemento está en la colección, de lo contrario false.
	public boolean contains(T object){
		for (int i = 0; i < this.array.length; i++){
			if(this.array[i].equals(object)) return true;
		}
		return false;
	}
	
	// Borra todos los elementos de la colección
	@SuppressWarnings("unchecked")
	public void clear(){
		this.array = (T[]) new Object[0];
	}
	
	// Borra el primer elemento de la colección
	public T pop(){
		T obj = this.array[0];
		remove(obj);
		return obj;
	}
	
	// Borra un elemento específico de la colección
	@SuppressWarnings("unchecked")
	public void remove(T object){
		T[] aux = (T[]) new Object[this.array.length - 1];
		int index = 0;
		for (int i = 0; i < this.array.length; i++){
			if(this.array[i] != object){
				aux[index] = this.array[i];
				index++;
			}
		}
		this.array = aux;
	}
	// Añade un elemento 
	@SuppressWarnings("unchecked")
	public void push(T object){
		T[] aux = (T[]) new Object[this.array.length + 1];
		
		for (int i = 0; i < this.array.length; i++){
			aux[i] = this.array[i];			
		}
		aux[aux.length - 1] = (T) object;
		this.array = aux;
	}



	@Override
	public String toString() {
		return "Array actual => " + Arrays.toString(array) + "";
	}
	
	
}
