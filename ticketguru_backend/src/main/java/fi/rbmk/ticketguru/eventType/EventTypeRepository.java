package fi.rbmk.ticketguru.eventType;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface EventTypeRepository extends CrudRepository<EventType, Long> {

	//List<EventType> findByEventType(String name );
	
	List<EventType> findAll();
	// List<EventOrganizer> findByEventName(String eventName);

	// List<EventOrganizer> findByEventInfo(String eventInfo);

}