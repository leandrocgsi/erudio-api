package br.com.erudio.entrypoint.v1.interfaces.generic;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface IGenericEntryPoint<T> {

	@RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
	@ResponseBody T save(@RequestBody T entity);

	@RequestMapping(method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.OK)
	@ResponseBody T update(@RequestBody T entity);

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.OK)
	@ResponseBody ResponseEntity<Void> delete(@PathVariable Integer id);

	@RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
	@ResponseBody T findById(@RequestParam(value="id") Integer id);
	
//	@RequestMapping(method = RequestMethod.GET)
//    @ResponseStatus(value = HttpStatus.OK)
//	@ResponseBody T findByName(@RequestParam(value="name") String name);

	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
	@ResponseBody List<T> findAll();
}