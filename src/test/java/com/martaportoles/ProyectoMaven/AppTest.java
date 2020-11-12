package com.martaportoles.ProyectoMaven;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import javax.activation.MailcapCommandMap;

import org.junit.Rule;
import org.junit.Test;

import constructor.ClienteBuilder;
import exceptions.ClientException;
import exceptions.DuplicateException;
import exceptions.IncorrectDNIException;
import exceptions.IncorrectEmailException;
import exceptions.IncorrectNIEException;
import exceptions.PossibleDuplicateClientException;
import model.Cliente;
import model.Cliente.Documento;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void testCreacionClienteCorrecta() throws ClientException {
			Cliente cliente = new ClienteBuilder(1)
			.withNombreCliente("Marta")
			.withTipoDocumento(Documento.DNI)
			.withNumeroDniNie("72997211W")
			.withEmail("marta@marta.es")
			.build();
			assertTrue(true);
    }

    @Test(expected = IncorrectEmailException.class)
    public void testCreacionClienteEmailMalFormado() throws ClientException {
			Cliente cliente = new ClienteBuilder(1)
			.withNombreCliente("Marta")
			.withTipoDocumento(Documento.DNI)
			.withNumeroDniNie("72997211W")
			.withEmail("marta@marta.")
			.build();
    }
    

    @Test(expected = IncorrectDNIException.class)
    public void testCreacionClienteDNIMalFormado() throws ClientException {
			Cliente cliente = new ClienteBuilder(1)
			.withNombreCliente("Marta")
			.withTipoDocumento(Documento.DNI)
			.withNumeroDniNie("72997211")
//			.withEmail("marta@marta.es")
			.build();
    }
    
    @Test
    public void testNoEmail() throws ClientException {
			Cliente cliente = new ClienteBuilder(1)
			.withNombreCliente("Marta")
			.withTipoDocumento(Documento.DNI)
			.withNumeroDniNie("72997211W")
			.withPassword("skldjj789z")
			.build();
    }    

    @Test(expected = IncorrectNIEException.class)
    public void testCreacionClienteNIEMalFormado1() throws ClientException {
			Cliente cliente = new ClienteBuilder(1)
			.withNombreCliente("Marta")
			.withTipoDocumento(Documento.NIE)
			.withNumeroDniNie("72997211W")
			.withApellidoContacto("Portoles")
			.withTelefono(666555444)
			.withEmail("marta@marta.es")
			.build();
    }
    
    @Test(expected = IncorrectNIEException.class)
    public void testCreacionClienteNIEMalFormado2() throws ClientException {
			Cliente cliente = new ClienteBuilder(1)
			.withNombreCliente("Marta")
			.withTipoDocumento(Documento.NIE)
			.withNumeroDniNie("A72997211W")
			.withApellidoContacto("Portoles")
			.withTelefono(666555444)
			.withEmail("marta@marta.es")
			.build();
    }
    
    @Test(expected = IncorrectNIEException.class)
    public void testCreacionClienteNIEMalFormado3() throws ClientException {
			Cliente cliente = new ClienteBuilder(1)
			.withNombreCliente("Marta")
			.withTipoDocumento(Documento.NIE)
			.withNumeroDniNie("A72997211")
			.withApellidoContacto("Portoles")
			.withTelefono(666555444)
			.withEmail("marta@marta.es")
			.build();
    }

    @Test(expected = IncorrectNIEException.class)
    public void testCreacionClienteNIEMalFormado4() throws ClientException {
			Cliente cliente = new ClienteBuilder(1)
			.withNombreCliente("Marta")
			.withTipoDocumento(Documento.NIE)
			.withNumeroDniNie("729972111")
			.withApellidoContacto("Portoles")
			.withTelefono(666555444)
			.withEmail("marta@marta.es")
			.build();
    }
    
    @Test(expected = IncorrectNIEException.class)
    public void testCreacionClienteNIEMalFormado5() throws ClientException {
			Cliente cliente = new ClienteBuilder(1)
			.withNombreCliente("Marta")
			.withTipoDocumento(Documento.NIE)
			.withNumeroDniNie("7729972111")
			.withApellidoContacto("Portoles")
			.withTelefono(666555444)
			.withEmail("marta@marta.es")
			.build();
    }
    
    @Test(expected = IncorrectNIEException.class)
    public void testCreacionClienteNIEMalFormado6() throws ClientException {
			Cliente cliente = new ClienteBuilder(1)
			.withNombreCliente("Marta")
			.withTipoDocumento(Documento.NIE)
			.withNumeroDniNie("A729972110")
			.withApellidoContacto("Portoles")
			.withTelefono(666555444)
			.withEmail("marta@marta.es")
			.build();
    }
    
    @Test(expected = IncorrectNIEException.class)
    public void testCreacionClienteNIEMalFormado7() throws ClientException {
			Cliente cliente = new ClienteBuilder(1)
			.withNombreCliente("Marta")
			.withTipoDocumento(Documento.NIE)
			.withNumeroDniNie("72997211W")
			.withApellidoContacto("Portoles")
			.withTelefono(666555444)
			.withEmail("marta@marta.es")
			.build();
    }
    
    @Test
    public void testCreacionClienteNIEBienFormado() throws ClientException {
			Cliente cliente = new ClienteBuilder(1)
			.withNombreCliente("Marta")
			.withTipoDocumento(Documento.NIE)
			.withNumeroDniNie("A2997211W")
			.withApellidoContacto("Portoles")
			.withTelefono(666555444)
			.withEmail("marta@marta.es")
			.build();
    }
}
