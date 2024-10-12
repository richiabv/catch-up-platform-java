/**
 * FavoriteSourceQueryService interface
 *
 * @Summary
 * The FavoriteSourceQueryService interface defines the contract for handling
 * queries related to favorite news sources. It provides methods to retrieve a
 * specific favorite source by its ID or a collection of all favorite sources.
 * The service ensures proper query handling and returns the appropriate data wrapped
 * in an Optional to handle cases where no results are found.
 */
package pe.upc.catchupplatform.news.domain.services;

import pe.upc.catchupplatform.news.domain.model.aggregates.FavoriteSource;
import pe.upc.catchupplatform.news.domain.model.queries.GetFavoriteSourceByIdQuery;
import pe.upc.catchupplatform.news.domain.model.queries.GetFavoriteSourceQuery;

import java.util.List;
import java.util.Optional;

public interface FavoriteSourceQueryService {

    Optional<FavoriteSource> handle(GetFavoriteSourceByIdQuery query);
    Optional<List<FavoriteSource>> handle(GetFavoriteSourceQuery query);

}
