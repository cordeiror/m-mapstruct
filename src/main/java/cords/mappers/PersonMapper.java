package cords.mappers;

import cords.model.Client;
import cords.model.Contact;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    Client contactToClient(Contact contact);

    Contact clientToContact(Client client);


}
