/**
 * GetFavoriteSourceByIdQuery query
 *
 * @Summary
 * The GetFavoriteSourceByIdQuery is a query object that encapsulates the data needed
 * to retrieve a favorite source by its unique identifier.
 * It ensures that the provided ID is valid (not null and greater than 0) before
 * executing the query logic.
 */
package pe.upc.catchupplatform.news.domain.model.queries;

public record GetFavoriteSourceByIdQuery(Long id) {
    public GetFavoriteSourceByIdQuery{
        if (id == null) {
            throw new IllegalArgumentException("id is required");
        }
        if (id <= 0) {
            throw new IllegalArgumentException("id must be greater than 0");
        }
    }
}
