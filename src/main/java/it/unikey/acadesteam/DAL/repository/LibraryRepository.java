package it.unikey.acadesteam.DAL.repository;

import it.unikey.acadesteam.BLL.dto.LibraryDto;
import it.unikey.acadesteam.DAL.entity.LibraryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//ho messo dto invece che entity nel diamond operator
@Repository
public interface LibraryRepository extends JpaRepository<LibraryDto, Integer> {
}
