package ar.edu.unlam.pg2;

import junit.framework.Assert;

public class Cerradura {
	
	private Integer claveDeApertura;
	private Integer cantidadFallosConsecutivosQueLaBloquean;
	private Boolean abierta;
	private Integer cantidadAperturasExitosas;
	private Integer cantidadIntentosFallidos;
	private Boolean cerraduraBloqueada;
	
	public Cerradura(Integer claveDeApertura, Integer cantidadDeFallosConsecutivosQueLaBloquean)
	{
		 abierta=false;
		 cantidadAperturasExitosas=0;
		 cantidadIntentosFallidos=0;
		 cerraduraBloqueada=false;
		
		 this.claveDeApertura=claveDeApertura;
		 this.cantidadIntentosFallidos=cantidadFallosConsecutivosQueLaBloquean;
	}
	
	public Boolean abrir(Integer clave)
	{
		
		if(this.cerraduraBloqueada==false)
		{
			if(this.claveDeApertura==clave)
				{
				this.abierta=true;
				this.cantidadAperturasExitosas++;
				this.cantidadIntentosFallidos=0;
				}
			
			else{
				this.abierta=false;
				this.cantidadIntentosFallidos++;
					if(cantidadIntentosFallidos>=cantidadIntentosFallidos)
						{
						this.cerraduraBloqueada=true;
						}
				}
		
		
		}
		else{
			this.abierta=false;

			}
		return this.abierta;
	}
	
	
	public void cerrar()
	{
		this.abierta;
	}
	
	public Boolean estaAbierta()
	{
	 return this.abierta;	
	}
	
	public Boolean estaCerrada()
	{
		
		if(this.abierta==false)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public Boolean fueBloqueada()
	{
		return this.cerraduraBloqueada;
	}
	
	public Integer contarAperturasExitosas()
	{
		return cantidadAperturasExitosas;
	}
	
	public Integer contarAperturasFallidas()
	{
		return cantidadIntentosFallidos;
	}
}
