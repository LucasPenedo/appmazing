package com.campusdual.appmazing.Service;

import com.campusdual.appmazing.API.IContactosService;
import com.campusdual.appmazing.Modelo.Contactos;
import com.campusdual.appmazing.Modelo.DAO.ContactosDao;
import com.campusdual.appmazing.Modelo.DTO.ContactosDTO;
import com.campusdual.appmazing.Modelo.DTO.ProductMapper.ContactosMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import java.util.List;
@Lazy
@Service("ContactosService")
public class ContactosService implements IContactosService {
    @Autowired
    private ContactosDao contactosDao;
    @Override
    public ContactosDTO queryContactos(ContactosDTO contactosDTO) {
        Contactos contactos = ContactosMapper.INSTANCE.toEntity(contactosDTO);
        Contactos contactosFinal = contactosDao.getReferenceById(contactos.getId());
        ContactosDTO dto = ContactosMapper.INSTANCE.toDTO(contactosFinal);
        return dto;
    }

    @Override
    public List<ContactosDTO> queryAllContactos() {
        return ContactosMapper.INSTANCE.toDTOList(this.contactosDao.findAll());
    }

    @Override
    public int insertContactos(ContactosDTO contactosDTO) {
        Contactos contactos = ContactosMapper.INSTANCE.toEntity(contactosDTO);
        this.contactosDao.saveAndFlush(contactos);
        return contactos.getId();
    }

    @Override
    public int updateContactos(ContactosDTO contactosDTO) {
        return this.insertContactos(contactosDTO);
    }

    @Override
    public int deleteContactos(ContactosDTO contactosDTO) {
        int id = contactosDTO.getId();
        Contactos contactos = ContactosMapper.INSTANCE.toEntity(contactosDTO);
        this.contactosDao.delete(contactos);
        return id;
    }
}
